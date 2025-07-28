package Pages;

import Web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccountPage extends Browser {

    By femaleGenderBtnLocator = By.xpath("//label[text()='Female']//input");
    By firstnameInputLocator = By.name("firstname");
    By lastnameInputLocator = By.name("lastname");
    By mobileNumberEmailInputLocator = By.xpath("//input[@aria-label='Mobile number or email']");
    By newPasswordInputLocator = By.id("password_step_input");
    By monthDropdownLocator = By.id("month");
    By dateDropdownLocator = By.id("day");
    By yearDropdownLocator = By.id("year");
    By signupBtnLocator = By.name("websubmit");
    By genderErrorLocator = By.xpath("(//div[text()='Please choose a gender. You can change who can see this later.'])[2]");

    public boolean isFemaleGenderSelected() {
        return driver.findElement(femaleGenderBtnLocator).isSelected();
    }

    public void enterFirstname(String firstname) {
        driver.findElement(firstnameInputLocator).sendKeys(firstname);
    }

    public void enterLastname(String lastname) {
        driver.findElement(lastnameInputLocator).sendKeys(lastname);
    }

    public void enterMobileNumOrEmail(String mobileNumOrEmail) {
        driver.findElement(mobileNumberEmailInputLocator).sendKeys(mobileNumOrEmail);
    }

    public void enterNewPassword(String newPassword) {
        driver.findElement(newPasswordInputLocator).sendKeys(newPassword);
    }

    public void enterCreateNewAccountData(String fieldName, String data) {
        switch (fieldName.toLowerCase()) {
            case "firstname":
                driver.findElement(firstnameInputLocator).sendKeys(data);
                break;
            case "lastname":
                driver.findElement(lastnameInputLocator).sendKeys(data);
                break;
            case "mobilenumoremail":
                driver.findElement(mobileNumberEmailInputLocator).sendKeys(data);
                break;
            case "newpassword":
                driver.findElement(newPasswordInputLocator).sendKeys(data);
                break;
            default:
                System.out.println("Field is not available - "+fieldName);
        }

    }

    public void selectMonth(String month) {
        WebElement monthDropdownElement = driver.findElement(monthDropdownLocator);
        Select monthDropdown = new Select(monthDropdownElement);
        monthDropdown.selectByVisibleText(month);
    }

    public void selectDate(String date) {
        WebElement dateDropdownElement = driver.findElement(dateDropdownLocator);
        Select dateDropdown = new Select(dateDropdownElement);
        dateDropdown.selectByVisibleText(date);
    }

    public void selectYear(String year) {
        WebElement yearDropdownElement = driver.findElement(yearDropdownLocator);
        Select yearDropdown = new Select(yearDropdownElement);
        yearDropdown.selectByVisibleText(year);
    }

    public void clickSignUpBtn() {
        driver.findElement(signupBtnLocator).click();
    }

    public boolean isGenderErrorDisplayed() {
        return driver.findElement(genderErrorLocator).isDisplayed();
    }




}
