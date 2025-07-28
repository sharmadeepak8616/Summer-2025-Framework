package Tests;

import Pages.LandingPage;
import Pages.VerificationPage;
import Web.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends Browser {
    /**
     * TC-1: Verify user gets error when enters invalid credentials
     *  1. Launch facebook.com
     *  2. Enter "abcd12@test.com" in login email
     *  3. Enter "abcd@1234" in login password
     *  4. Click "Login" button
     *  5. Verify error is displayed
     */
    @Test
    public void verifyInvalidLogin() {
        LandingPage landingPage = new LandingPage();
        VerificationPage verificationPage = new VerificationPage();

        // 1. Launch facebook.com
        // Browser.openWebpage();
        // 2. Enter "abcd12@test.com" in login email
        landingPage.enterLoginEmail("abcd12@test.com");
        // 3. Enter "abcd@1234" in login password
        landingPage.enterLoginPassword("abcd@1234");
        // 4. Click "Login" button
        landingPage.clickLoginBtn();
        // 5. Verify error is displayed
        boolean isErrorDisplayed = verificationPage.isLoginErrorMsgDisplayed();
        Assert.assertTrue(isErrorDisplayed, "Error for invalid credentials is NOT displayed");
    }

    /**
     * TC-2: Verify user gets error when try with no credentials
     *  1. Launch facebook.com
     *  2. Click "Login" button
     *  3. Verify error is displayed
     */
    @Test
    public void verifyNoCred() {
        LandingPage landingPage = new LandingPage();
        VerificationPage verificationPage = new VerificationPage();

        // 2. Click "Login" button
        landingPage.clickLoginBtn();

        // 3. Verify error is displayed
        boolean isErrorDisplayed = verificationPage.isLoginErrorMsgDisplayed();
        Assert.assertTrue(isErrorDisplayed, "Error for invalid credentials is NOT displayed");
    }

    /**
     * TC-3: Verify default login fields and buttons are enabled
     *  1. Launch facebook.com
     *  2. Verify login-email field is enabled
     *  3. Verify login-password field is enabled
     *  4. Verify login-button is enabled
     */

    /**
     * TC-4: Verify user gets is able to login when enters valid credentials
     */
}
