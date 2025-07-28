package Tests;

import Pages.CreateNewAccountPage;
import Pages.LandingPage;
import Web.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests extends Browser {
    /**
     * TC-1 : Verify no gender is selected on Sign up page
     * 1. Launch facebook.com
     * 2. Click on Create new account button
     * 3. Verify Female gender button is NOT selected
     * 4. Verify Male gender button is NOT selected
     * 5. Verify Not specified gender button is NOT selected
     */
    @Test
    public void verifyNoGenderSelected() {
        LandingPage landingPage = new LandingPage();
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();

        // 2. Click on Create new account button
        landingPage.clickCreateNewAccountBtn();

        // 3. Verify Female gender button is NOT selected
        boolean isFemaleGenderSelected = createNewAccountPage.isFemaleGenderSelected();
        Assert.assertFalse(isFemaleGenderSelected, "Female gender is selected");
    }



}
