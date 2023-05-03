package org.example;


import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
   // static String expectedCommunitypoleErrorMessage = "Only registered users can ";
    HomePage homepage = new HomePage();
    RegisterPage registerPage=new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    @Test
    public void verifyuserhouldBeRegisterSuccessfully(){
        //click on register button
        homepage.clickOnRegisterButton();
        //fill in registetion details
        registerPage.fillInRegistrationDetails();
        //veryfying register success or not
        registerResultPage.verifyUserRegisteredSuccessfully();
}}
