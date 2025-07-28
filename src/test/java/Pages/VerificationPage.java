package Pages;

import Web.Browser;
import org.openqa.selenium.By;

public class VerificationPage extends Browser {

    By loginErrorLocator = By.xpath("//div[contains(text(), \"isn’t connected to an account\")]");

    public boolean isLoginErrorMsgDisplayed() {
        return driver.findElement(loginErrorLocator).isDisplayed();
    }

}
