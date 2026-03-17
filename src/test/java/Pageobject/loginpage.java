package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
    WebDriver driver;
    public loginpage(WebDriver d) {
        driver = d;
        PageFactory.initElements(d,this);
    }

    @FindBy(name= "Email")
    WebElement txtemail;

    @FindBy(name= "Password" )
    WebElement txtpassword;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginbtn;


    @FindBy(xpath="//a[text()='Logout']")
    WebElement logoutbtn;

    public void EnterEmail(String email){
        txtemail.clear();
        txtemail.sendKeys(email);
    }

    public void EnterPassword(String pass){
        txtpassword.clear();
        txtpassword.sendKeys(pass);
    }
    public void ClickonLoginbtn(){
        loginbtn.click();
    }

    public void ClickonLogoutbtn(){
        logoutbtn.click();
    }
    public void CloseBrowser(){
        driver.quit();
    }

}
