package pages;
import utils.BrowserUtils;
import io.cucumber.java.an.Y;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class VersaceRegisterPage {

    public VersaceRegisterPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[@class='account-login-label']")
    public WebElement registerButton;
    @FindBy(xpath = "//button[@name='dwfrm_login_register']")
    public  WebElement createAccount;
    @FindBy(id = "dwfrm_profile_customer_title")
    public WebElement titleSelection;
    @FindBy(id = "dwfrm_profile_customer_firstname")
    public WebElement firstName;
    @FindBy(id = "dwfrm_profile_customer_lastname")
    public WebElement lastName;
    @FindBy(id = "dwfrm_profile_customer_birthdayfields_month")
    public WebElement Month;
    @FindBy(xpath = "//select[@name='dwfrm_profile_customer_birthdayfields_day']")
    public  WebElement Day;
    @FindBy(id = "dwfrm_profile_customer_birthdayfields_year")
    public WebElement Year;
    @FindBy(xpath = "//input[@id='dwfrm_profile_customer_email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='dwfrm_profile_customer_emailconfirm']")
    public WebElement confirmEmail;
    @FindBy(xpath = "//input[@id='dwfrm_profile_login_password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='dwfrm_profile_login_passwordconfirm'")
    public WebElement confPassword;
    @FindBy (xpath = "//input[@id=‘privacy-policy-checkbox’]")
    public WebElement checkBox;
    @FindBy(xpath = "//input[@id='dwfrm_profile_customer_phone']")
    public WebElement phoneNumber;
    @FindBy(id = "dwfrm_profile_customer_country")
    public WebElement countryOption;
    public void clickButton() {
        registerButton.click();
    }
    public  void clickCreateButton(){
        createAccount.click();
    }
    public  void selectTitle(String text){
        BrowserUtils utils=new BrowserUtils();
        utils.selectByText(titleSelection,text);
    }
    public void sendKeysNames(String firstname,String lastname){
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
    }
    public void selectBirthDates(String monthS, String dayS, String yearS){
        BrowserUtils utils=new BrowserUtils();
        utils.selectByText(Month,monthS);
        utils.selectByText(Day,dayS);
        utils.selectByText(Year,yearS);
    }
    public void selectCountry(String country){
        BrowserUtils utils=new BrowserUtils();
        utils.selectByText(countryOption,country);
    }

}
