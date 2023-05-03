package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class AndroidLolipop {
    protected static WebDriver driver;
    static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/button[2]")).click();
        driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[2]"));
       // System.out.println(firstresult.getText());
        driver.findElement(By.linkText("product comparison")).click();}

    }

