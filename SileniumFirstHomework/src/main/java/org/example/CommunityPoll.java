package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Timestamp;

public class CommunityPoll {
    protected static WebDriver driver;
    static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
       driver.findElement(By.id("pollanswers-2")).click();
       driver.findElement(By.xpath("//button[@id=\"vote-poll-1\"]")).click();
   //    driver.close();

    }
}
