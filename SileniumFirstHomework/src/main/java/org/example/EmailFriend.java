package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Timestamp;

public class EmailFriend {
    protected static WebDriver driver;
    static Timestamp timestamp = new Timestamp(System.currentTimeMillis());


    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-4\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]")).click();
        driver.findElement(By.name("Email")).sendKeys("frindlike"+timestamp.getTime()+"@gmail.com");
        driver.findElement(By.name("Email")).sendKeys("mymail"+timestamp.getTime()+"@gmail.com");
        driver.findElement(By.xpath("//button[@name=\"send-email\"]")).click();
       // driver.close();
    }
}
