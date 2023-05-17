package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _result = By.xpath("//div[@class=\"result\"]");
    public void verfyUserResisteredSuccessfully(){
        String expectedRegistrationCompleteMGS = loadProp.getProperty( "RegistrationCompleteMGS");
        String actualMessage = getTextFromelement(_result);
        System.out.println("My message:"+actualMessage);// result willl come out
        Assert.assertEquals(actualMessage,expectedRegistrationCompleteMGS,"Your registration complete");


}}
