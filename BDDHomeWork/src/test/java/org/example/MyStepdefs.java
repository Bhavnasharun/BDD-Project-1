package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LogInPage logInPage = new LogInPage();
    AppleMacEmailFriend appleMacEmailFriend = new AppleMacEmailFriend();
    AppleMackBook appleMackBook = new AppleMackBook();

    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        homePage.clickOnRegisterButton();
    }
    @When("I enter required registration details with timestamp")
    public void i_enter_required_registration_details_with_timestamp() {
       registerPage.FillinRegistrationDetailswithtimestamp();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        registerResultPage.verfyUserResisteredSuccessfully();

    }


    @Given("I am on registeration")
    public void i_am_on_registeration() {
       homePage.clickOnRegisterButton();
    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        registerPage.FillinRegistrationDetailswithouttimestamp();

    }
    @When("I am on login page")
    public void i_am_on_login_page() {
        homePage.loginforlogin();

    }
    @When("I enter valid email and password")
    public void i_enter_valid_email_and_password() {
        logInPage.enteremailandpassword();

    }
    @When("I click on Apple Mac Book Pro 13Inch")
    public void i_click_on_apple_mac_book_pro_13inch() {
       homePage.clickonappleMacbook();
    }
    @When("I click email a friend")
    public void i_click_email_a_friend() {
        appleMackBook.emailAFriend();


    }
    @When("I enter friend's email and message")
    public void i_enter_friend_s_email_and_message() {
        appleMacEmailFriend.enteremaildetailsoffriend();

    }
    @Then("I should email a friend successfully")
    public void i_should_email_a_friend_successfully() {
        appleMacEmailFriend.successfullymassegeapper();

    }


//    @Given("I am on registration page")
//    public void i_am_on_registration_page(){
//        homePage.clickOnRegisterButton();}
//    @When("I enter required registration details with timestamp")
//    public void i_enter_required_registration_details_with_timestamp(){
//    registerPage.FillinRegistrationDetailswithtimestamp();}
//    @And("I enter required registration details without timestamp")
//    public void i_enter_required_registration_details_without_timestamp(){
//    registerPage.FillinRegistrationDetailswithouttimestamp();
//    }
//    @Then("I should able to register successfully")
//    public void i_should_able_to_register_successfully(){
//    registerResultPage.verfyUserResisteredSuccessfully();}



//    @And("I am on login page")
//    public void i_am_on_login_page(){
//        homePage.loginforlogin();}
//    @And("I enter valid email and password")
//    public void i_enter_valid_email_and_password(){
//        logInPage.enteremailandpassword();}
//    @And("I click on Apple Mac Book Pro 13Inch")
//    public void i_click_on_apple_mac_book_pro_13inch(){
//        homePage.applMacbookPro();}
//    @And("I click email a friend")
//    public void i_click_email_a_friend(){
//    appleMackBook.emailAFriend();}
//    @And("I enter friend's email and message")
//    public void i_enter_friend_s_email_and_message(){
//        appleMacEmailFriend.enteremaildetailsoffriend();}
//    @Then("I should email a friend successfully")
//    public void i_should_email_a_friend_successfully(){
//        appleMacEmailFriend.successfullymassegeapper();
//    }
    }
