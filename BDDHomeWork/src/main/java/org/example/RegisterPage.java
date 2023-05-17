package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Utils{
    private By _firstName = By.id("FirstName");
    private By _LastName = By.id("LastName");
    private By _Email =By.id("Email");
    private By _Password = By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");
    private By _registersubmitButton = By.id("register-button");
    private By _day = By.name("DateOfBirthDay");
    private By _month = By.name("DateOfBirthMonth");
    private By _Year = By.name("DateOfBirthYear");
    LoadProp loadProp = new LoadProp();
    public void FillinRegistrationDetailswithtimestamp(){//regester for Q-7,6, 1
        //  clickOnElement(_femaleButton);
        typetaxt(_firstName,loadProp.getProperty("firstName"));
        typetaxt(_LastName,loadProp.getProperty("LastName"));
        selectElementByValue(_day, loadProp.getProperty("day"));
        selectElementByIndex(_month,Integer.parseInt(loadProp.getProperty("month")));
        selectElementByText(_Year, loadProp.getProperty("year"));
        typetaxt(_Email,loadProp.getProperty("Email")+timestamp()+
                loadProp.getProperty("EmailDOmain"));//this metod
        typetaxt(_Password,loadProp.getProperty("password"));
        typetaxt(_ConfirmPassword,loadProp.getProperty("ConfirmPassword"));
        clickOnElement(_registersubmitButton);

    }
    public void FillinRegistrationDetailswithouttimestamp(){//regester for Q-7,6, 1
        //  clickOnElement(_femaleButton);
        typetaxt(_firstName,loadProp.getProperty("firstName"));
        typetaxt(_LastName,loadProp.getProperty("LastName"));
        selectElementByValue(_day, loadProp.getProperty("day"));
        selectElementByIndex(_month,Integer.parseInt(loadProp.getProperty("month")));
        selectElementByText(_Year, loadProp.getProperty("year"));
        typetaxt(_Email,loadProp.getProperty("emailwithouttimestamp"));//this metod
        typetaxt(_Password,loadProp.getProperty("password"));
        typetaxt(_ConfirmPassword,loadProp.getProperty("ConfirmPassword"));
        clickOnElement(_registersubmitButton);

}public static void main(String[] args) {
        Select select = new Select(driver.findElement(By.name("country")));
    }
}
