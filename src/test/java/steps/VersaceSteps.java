package steps;
import pages.VersaceRegisterPage;
import utils.BrowserUtils;
import utils.ConfiguReader;
import utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.ConfiguReader;
import utils.Driver;

import static utils.Driver.getDriver;
public class VersaceSteps {
    WebDriver driver;
    VersaceRegisterPage versaceRegisterPage;
    BrowserUtils browserUtils;

    @Given("the user on the  home page")
    public  void the_user_on_the_home_page() throws InterruptedException {
        driver= Driver.getDriver();
        driver.get(ConfiguReader.getProperty("url"));
        versaceRegisterPage=new VersaceRegisterPage(driver);
        versaceRegisterPage.clickButton();
        browserUtils=new BrowserUtils();
        browserUtils.scrollDown();
        versaceRegisterPage.clickCreateButton();
    }
    @Then("user select {string} option")
    public void user_select_option(String title) {
        versaceRegisterPage=new VersaceRegisterPage(driver);
        versaceRegisterPage.selectTitle(title);
    }
    @Then("user enters {string} , {string}")
    public void user_enters(String firstName, String lastName) {
        //   versaceRegisterPage=new VersaceRegisterPage(driver);
        versaceRegisterPage.sendKeysNames(firstName, lastName);
    }
    @Then("user enters {string},{string},{string}")
    public void user_enters(String month, String day, String year) {
        versaceRegisterPage=new VersaceRegisterPage(driver);
        versaceRegisterPage.selectBirthDates(month, day, year);
    }
    @Then("user selects {string}")
    public void user_selects(String country) {
        versaceRegisterPage.selectCountry(country);
    }
    @Then("user provide {string}, {string},{string},{string},{string}")
    public void user_provide(String email, String confirmEmail, String password, String confPassword, String phoneNum) {
    }
    @Then("user clicks {string}  , {string}")
    public void user_clicks(String policyButton, String registerButton) {
    }
    @Then("user validate details {string},{string} , {string},{string},{string},{string},{string},{string}, {string},{string},{string},{string}")
    public void user_validate_details(String title, String firstName, String lastName, String month, String day, String year, String country, String email, String confEmail, String password, String confPassword, String phoneNum) {
    }
}
