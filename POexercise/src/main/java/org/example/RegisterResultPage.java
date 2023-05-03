package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utills{
    private By _actualMessage = By.className("result");
    static String expectedRegistretionCompleteMSG = "Your registration completed";
    public void verifyUserRegisteredSuccessfully(){
        String actualMessage = getTextFromelement(By.xpath("//div[@class=\"result\"]"));
        System.out.println("My mesage:"+actualMessage);// result willl come out
        Assert.assertEquals(actualMessage,expectedRegistretionCompleteMSG,"registration"+"is working");
    }

}
