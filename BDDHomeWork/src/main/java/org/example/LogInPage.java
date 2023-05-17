package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utils{

    private By _email = org.openqa.selenium.By.cssSelector("input.email");
    private By _password = org.openqa.selenium.By.id("Password");
    private By _login = org.openqa.selenium.By.xpath("//button[text()='Log in']");
LoadProp loadProp = new LoadProp();
    public void enteremailandpassword(){
        typetaxt(_email,loadProp.getProperty("emailwithouttimestamp"));
        typetaxt(_password, loadProp.getProperty("password"));
        clickOnElement(_login);

}}
