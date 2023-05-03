package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utills{
   private By _firstName = By.id("FirstName");
   private By _LastName = By.id("LastName");
   private By _email = By.name("Email");
   private By _Passwod = By.id("Password");
   private By _ConfirmPassword = By.id("ConfirmPassword");
   private By _registersubmitButton = By.id("register-button");

    public void fillInRegistrationDetails(){
        typetaxt(_firstName,"TestFirst");//enter name
        typetaxt(_LastName, "TestLastName");//enter surname
        typetaxt(_email,"test+"+timestamp()+"@gmail.com");//enter email
        typetaxt(_Passwod,"test1234");//enter pass word
        typetaxt(_ConfirmPassword,"test1234");// enter conform password
        clickOnElement(_registersubmitButton);// click on register button
    }


}
