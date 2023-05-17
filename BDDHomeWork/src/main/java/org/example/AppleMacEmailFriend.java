package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AppleMacEmailFriend extends Utils{
    private By _emailFriend = By.id("FriendEmail");
    private By _yourEmail = By.id("YourEmailAddress");
    private By _sendEmail = By.xpath("//button[text()='Send email']");
    private   By _writeMessage = By.id("PersonalMessage");
    private By _mesage = By.xpath("//div[@class='result']");
    LoadProp loadProp = new LoadProp();
    public void enteremaildetailsoffriend(){
        typetaxt(_emailFriend,loadProp.getProperty("EmailFriend"));
       // typetaxt(_yourEmail,loadProp.getProperty("Youremail")+timestamp()+
       //         loadProp.getProperty("yourdomainemail"));
        typetaxt(_writeMessage, loadProp.getProperty("writemessage"));
        clickOnElement(_sendEmail);
    }

    public void successfullymassegeapper(){

        Assert.assertEquals(getTextFromelement(_mesage),loadProp.getProperty("SendIteamToFriend"));
        }
}





