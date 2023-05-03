package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class SeleniumFirst {
    protected static WebDriver driver;
    // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    static String expectedRegisterationCompleteMSG = "Your registration completed ";
    static String expectedProductIncart = "Register not successful";

    @BeforeMethod
    public static void openBrowser() {
        driver = new ChromeDriver();
        driver.get("/https://demo.nopcommerce.com"); 
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public static void closeBrowser() {
        driver.close();
    }

    @Test
    public static void verifyUserShouldAbleToRegisterSuccessfully() {
        //click on resister button
        clickOnElement(By.className("ico-register"));
        //type first name
        typetaxt(By.id("FirstName"), "TestFirst");
        //type last name
        typetaxt(By.id("LastName"), "TestLastName");
        //type email address
        typetaxt(By.name("Email"), "testemail+" + timestamp() + "@gmail.com");
        //type pass word
        typetaxt(By.id("Password"), "test1234");
        //type confirm password
        typetaxt(By.id("ConfirmPassword"), "test1234");
        //click on resister submit button
        clickOnElement(By.id("register-button"));
        String actualMessage = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        System.out.println("My message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedRegisterationCompleteMSG, "registration " +
                "is not working");
    }


    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typetaxt(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }

}
