package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
    LoadProp loadProp = new LoadProp();
    String browserName = "chrome";
    //
    public void openBrowser(){
        if(browserName.equalsIgnoreCase("Edge")){
            driver=new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }else {
            System.out.println("Your browse name is wrong and not implemented");
        }

        driver.get(loadProp.getProperty("url"));
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void closeBrowser(){
        driver.close();// this class have to creat second and only close and open
    }

}
