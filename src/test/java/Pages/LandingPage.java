package Pages;

import Web.Browser;
import org.openqa.selenium.By;

public class LandingPage extends Browser {

    By loginEmailLocator = By.id("email");
    By loginPwdLocator = By.id("pass");
    By loginBtnLocator = By.tagName("button");
    By createNewAccountBtnLocator = By.xpath("//a[@data-testid='open-registration-form-button']");


    public void enterLoginEmail(String loginEmail) {
        driver.findElement(loginEmailLocator).sendKeys(loginEmail);
    }

    public void enterLoginPassword(String loginPwd) {
        driver.findElement(loginPwdLocator).sendKeys(loginPwd);
    }

    public void clickLoginBtn() {
        driver.findElement(loginBtnLocator).click();
    }

    public void clickCreateNewAccountBtn() {
        driver.findElement(createNewAccountBtnLocator).click();
    }



}
