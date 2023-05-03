package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.sql.Timestamp;

public class EmailFriendPage extends Utils{
private By _email = By.xpath("//input[@id=\"FriendEmail\"]");
private By _yourEmail = By.xpath("//input[@id=\"YourEmailAddress\"]");
private By _SendEmail = By.xpath("//button[text()=\"Send email\"]");
//this one is qutions two add to cart iteam and email the iteam
public void clickemaildetails(){
    typetaxt(_email,"Bhav."+ timestamp()+"@gmail.com");
    typetaxt(_yourEmail,"Shan."+timestamp()+"@gmail.com");
    clickOnElement(_SendEmail);}
    public String expectedRegistretionCompleteMSG = "Your registration completed";
    public void SuccessfullyemailtoFriend(){
        String actualMessage = getTextFromelement(By.xpath("//button[text()=\"Send email\"]"));
        System.out.println("Actual masage:"+actualMessage);
        Assert.assertEquals(actualMessage,expectedRegistretionCompleteMSG,"Thank you for Email");
    }
}
