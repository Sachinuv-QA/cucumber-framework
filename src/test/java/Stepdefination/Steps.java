package Stepdefination;

import Pageobject.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Steps {
    public WebDriver driver;
    public loginpage lp;

    @Given("Launch chrome Browser")
    public void launch_chrome_browser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

    // disable password popups
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);

         driver = new ChromeDriver(options);
    }

    @When("Open url {string}")
    public void open_url(String url) {
        driver.get(url);
    }

    @Then("Enter Email as {string} and Password {string}")
    public void enter_email_as_and_password(String email, String password) {
        lp = new loginpage(driver);
        lp.EnterEmail(email);
        lp.EnterPassword(password);
    }

    @Then("Click on Login button")
    public void Click_on_login_button() {
        lp.ClickonLoginbtn();

    }

    @Then("Click on Logout button")
    public void Click_on_logout_button() {
        lp.ClickonLogoutbtn();
    }

    @Then("Close Browser")
    public void close_browser() {
        lp.CloseBrowser();

    }

}
