package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _login1 = org.openqa.selenium.By.xpath("//a[text()='Log in']");
    private By _registerButton = By.xpath("//a[@class='ico-register']");
    private By _AppleMacBook = By.xpath("//img[@alt='Picture of Apple MacBook Pro 13-inch']");//Q-6 c
    private By _emailfriend = By.xpath("//button[text()='Email a friend']");
   private By _appleMacBookPro13Inch = By.linkText("Apple MacBook Pro 13-inch");
    public void clickOnRegisterButton() {
        clickOnElement(_registerButton);
    }
    public void applMacbookPro() {
        waitForClickable(_AppleMacBook,20);
        clickOnElement(_AppleMacBook);
        clickOnElement(_emailfriend);}
    public void loginforlogin(){
        clickOnElement(_login1);}
    public void clickonappleMacbook(){
        clickOnElement(_appleMacBookPro13Inch);
    }
    //

}

