package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class MyPractice {
    protected static WebDriver driver;
    static String expectedRegistretionCompleteMGS = "Your registeration completed";
    static String expectedproductIntraction = "Register is successfull";
    @BeforeMethod
    public static void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod
    public static void closeBrowser(){driver.close();}

    @Test
    public static void VeryfyUserShouldableToregisterSuccessFully(){
        openBrowser();
        clickOnElement(By.className(" ico-register "));
        clickOnElement(By.id("gender-female"));
        typetaxt(By.id("FirstName"),"TestFirstName");
        typetaxt(By.id("LastName"),"TestLastname");
        typetaxt(By.name("Email"),"test"+timestamp()+"@gmail.com");
        typetaxt(By.id("Password"), "Bhav123");
        typetaxt(By.id("ConfirmPassword"),"Bhav123");
        clickOnElement(By.id("register-button"));
        String actualmesage = getTextFromelemennt(By.xpath("result"));
        System.out.println("My message:"+actualmesage);
        Assert.assertEquals(actualmesage,expectedRegistretionCompleteMGS,"registration"+"is working");

    }
  public static void clickOnElement(By by){driver.findElement(by).click();}
    public static void typetaxt(By by,String text){driver.findElement(by).sendKeys(text);}
   public static String getTextFromelemennt(By by){return driver.findElement(by).getText();}
   public static long timestamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    return timestamp.getTime();
    }
}
