package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utills {
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void closeBrowser(){
        driver.close();

    }
}
