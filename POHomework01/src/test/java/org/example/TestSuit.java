package org.example;

import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    ResisterResultPage registerRsultPage =new ResisterResultPage();
    ComparePage comparePage = new ComparePage();
    ComputerPage computerPage = new ComputerPage();
    EmailFriendPage emailFriendPage = new EmailFriendPage();
    AddToCartPage addToCartPage = new AddToCartPage();
    LogInPage logInPage = new LogInPage();
     VoteResult voteResult = new VoteResult();
     ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
     NikeProductPage nikeProductPage = new NikeProductPage();
     NewRealeasePage newRealeasePage = new NewRealeasePage();
     FaceBookPage faceBookPage = new FaceBookPage();
     WelcomeSignPage welcomeSignPage = new WelcomeSignPage();
     BillingCheckOutPage billingCheckOutPage = new BillingCheckOutPage();
     CheckOutPage checkOutPage = new CheckOutPage();
     AppleMacEmailFriend appleMacEmailFriend = new AppleMacEmailFriend();

    @Test
public void verifyusershouldBeRegisterSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        //fill in registetion detail
        registerPage.FillinRegistrationDetails();
        registerRsultPage.verfyUserResisteredSuccessfully();
//        homePage. printProductNames();
    }
    @Test

    public void veryfyusershould(){
    homePage.DoVoteButton();
    voteResult.VeryfyingUserShoulVote();}
    @Test
    public void veryfyUsershouldAbleToCompairIteam(){
        homePage.CompairTheElement();
        comparePage.clickelementList();
        comparePage.veryfytoMSGShouldappear();}
    @Test
     public void veryfiyUserShouldableToemailFriend(){
        homePage.emailfriendIteam();
        computerPage.ClickOnEmailToFriend();
       emailFriendPage.clickemaildetails();
        emailFriendPage.SuccessfullyemailtoFriend();
    }
    @Test
    public void verfiyUserShouldAbleToaddIteamoncart(){
        homePage.addTocardIteam();
        addToCartPage.UsershouldableToaddtheiteam();
        addToCartPage.successfulyiteamadd();
        shoppingCartPage.successfulyiteamadd();}
    @Test
    public void verifiyregisterUserShouldableToReferIteam() {
        homePage.clickOnRegisterButton();
       registerPage.FillinRegistrationDetails();
       registerRsultPage.verfyUserResisteredSuccessfully();
       logInPage.VeryfyUserShaouldClick();
       homePage.applMacbookPro();
       appleMacEmailFriend.sendemailtofriend();
       appleMacEmailFriend.appleMacbookemailtoyourfriend();

    }
    @Test
    public void veryfyRegisterUserShoulAbleToVotesuccessfullly(){
        homePage.clickOnRegisterButton();
        registerPage.FillinRegistrationDetails();
        registerRsultPage.verfyUserResisteredSuccessfully();
        homePage.clickOnLoginButton();
        logInPage.VeryfyUserShaouldClick();
      // logInPage.VeryfyingUserShoulloginsuccessFully();
        homePage.DoVoteButton();
        voteResult.VeryfyingUserShoulVote();}
    @Test
    public void messageWillCome(){
        homePage.ClickOnSearchButton();
    }
    @Test
    public void UserShouldAbleToPrintOutAllThelist(){
        homePage.printProductNames();
    }
    @Test
    public void ToVerifyUserShouldAbleToChangeCurrency(){
          homePage.clickoncurrencyButtonDoller();
          homePage.clickCurrencyButtonEuro();

    }
    @Test
    public void ToverifyVoteMssageShoulApear(){
        homePage.clickOnVoteButton();
        homePage.MessageShouldApearForVote();
    }
    @Test
    public void ToVeryfiUserShouldSearchIteam(){
        homePage.SearchIteamAccordingli();
        nikeProductPage.AllTheNikeProduct();
    }
    @Test
    public void ToVerifyUserShouldNewReleaseDetail(){
        homePage.nopCommercenewRealease();
        newRealeasePage.FillInTheDetails();
        newRealeasePage.verifyUserAddCommentSuccessfully();
        newRealeasePage.verifyLasttimeMessageShouldPrint();
    }
    @Test
    public void ToverifyUserShouldableToLogInFaceBook(){
        homePage.UserShouldAbleToclickOnfacebook();
        faceBookPage.verifyingFacebookPage();
        homePage.verifyWelcomeMessageOnFaceBook();
    }
    @Test
    public void ToVerifyUserShouldAbleToOrderSuccessfullyComputer(){
        homePage.BuildYourComputer();
        computerPage.BUildYourComputer();
        shoppingCartPage.CheckOutProcess();
        welcomeSignPage.CheckOutAsGuest();
        billingCheckOutPage.shipingAddressDetails();
        checkOutPage.CheckOutComputer();
        checkOutPage.verfyUserShouldOrderSuccessfully();

    }
    @Test
    public void verifymyLoadpro(){
        System.out.println("url");
    }
}















