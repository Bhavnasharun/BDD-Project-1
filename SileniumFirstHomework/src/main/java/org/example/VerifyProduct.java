package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyProduct {
    protected static WebDriver driver;

    public static void main(String[] args) {
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //click on electronics
        driver.findElement(By.xpath("//img[@title=\"Show products in category Electronics\"]")).click();
        //click on camera
        driver.findElement(By.xpath("//img[@title=\"Show products in category Camera & photo\"]")).click();
                //print to veryfy the product
       String productname = driver.findElement(By.xpath("(//h2[@class=\"" +
              "product-title\"])[3]")).getText();
       System.out.println("product name is:"+productname);
        

    }
}
