package testsMethods;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Base;
import pom.AccountPage;
import pom.HomePage;
import pom.LoginPage;
public class LoginTest extends Base{
	public WebDriver driver;
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@BeforeMethod
	public void setup() throws IOException {
		driver = initializeBrowser();
		driver.get(	prop.getProperty("url"));
	}
	@Test(priority=2)
	public void loginWithInvalidCredentials() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccountDropMenu();
		LoginPage loginPage = homePage.clickOnLoginOption();
		loginPage.enterEmailAddress(generateNewEmailTimeStamp());
		loginPage.enterPassword(prop.getProperty("invalidpassword"));
		loginPage.clickOnLoginButton();
		Assert.assertTrue(loginPage.retrieveInvalidCredentailsWarningMessage().contains(prop.getProperty("invalidcredentailswarning")));
	}
	@Test(priority=1)
	public void loginWithValidCrendetials() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccountDropMenu();
		LoginPage loginPage = homePage.clickOnLoginOption();
		loginPage.enterEmailAddress(prop.getProperty("validemail"));
		loginPage.enterPassword(prop.getProperty("validpassword"));
		AccountPage accountPage = loginPage.clickOnLoginButton();		
		Assert.assertFalse(accountPage.verifyDisplayOfEditYourAccountInformationOption());
	}
}
