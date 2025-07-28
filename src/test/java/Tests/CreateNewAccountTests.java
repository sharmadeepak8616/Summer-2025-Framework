package Tests;

import Pages.CreateNewAccountPage;
import Pages.LandingPage;
import Web.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewAccountTests extends Browser {
    /**
     * TC: Verify gender error is displayed
     * 1. Launch facebook.com
     * 2. Click Create new account button
     * 3. Enter Firstname as John
     * 4. Enter lastname as Brady
     * 5. Select Mar-23 1976 as date of birth
     * 6. Enter Email as johnbrady@test.com
     * 7. Enter password as johnBrady@1234
     * 8. Click Sign Up button
     * 9. Verify gender error is displayed (Please choose a gender. You can change who can see this later.)
     */
    @Test
    public void verifyGenderError() {
        LandingPage landingPage = new LandingPage();
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();

        // 2. Click Create new account button
        landingPage.clickCreateNewAccountBtn();

        // 3. Enter Firstname as John
        // createNewAccountPage.enterFirstname("John");
        createNewAccountPage.enterCreateNewAccountData("firstname", "John");

        // 4. Enter lastname as Brady
        // createNewAccountPage.enterLastname("Brady");
        createNewAccountPage.enterCreateNewAccountData("lastname", "Brady");

        // 5. Select Mar-23 1976 as date of birth
        createNewAccountPage.selectMonth("Mar");
        createNewAccountPage.selectDate("23");
        createNewAccountPage.selectYear("1976");

        // 6. Enter Email as johnbrady@test.com
        // createNewAccountPage.enterMobileNumOrEmail("johnbrady@test.com");
        createNewAccountPage.enterCreateNewAccountData("mobileNumOrEmail", "johnbrady@test.com");

        // 7. Enter password as johnBrady@1234
        // createNewAccountPage.enterNewPassword("johnBrady@1234");
        createNewAccountPage.enterCreateNewAccountData("newPassword", "johnBrady@1234");

        // 8. Click Sign Up button
        createNewAccountPage.clickSignUpBtn();

        // 9. Verify gender error is displayed (Please choose a gender. You can change who can see this later.)
        boolean isGenderErrorDisplayed = createNewAccountPage.isGenderErrorDisplayed();
        Assert.assertTrue(isGenderErrorDisplayed, "Gender error is NOT displayed");
    }
}
