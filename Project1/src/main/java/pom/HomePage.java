package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Login")
	private WebElement loginOption;
	@FindBy(name="search")
	private WebElement searchBoxField;
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountDropMenu;
	@FindBy(xpath="//i[contains(@class,'fa-search')]")
	private WebElement searchButton;
	@FindBy(linkText="Register")
	private WebElement registerOption;
	public void enterSearchTextIntoSearchField(String searchText) {
		searchBoxField.sendKeys(searchText);
	}
	public SearchPage clickOnSearchButton() {
		searchButton.click();
		return new SearchPage(driver);
	}
	public void clickOnMyAccountDropMenu() {
		myAccountDropMenu.click();	
	}
	public LoginPage clickOnLoginOption() {
		loginOption.click();
	return new LoginPage(driver);
	}
	public RegisterPage clickOnRegisterOption() {
		registerOption.click();
	return new RegisterPage(driver);
	}
}
