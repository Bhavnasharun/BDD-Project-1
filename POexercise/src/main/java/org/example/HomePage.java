package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utills {
    private By _registerButton = By.className("ico-register");
    public void clickOnRegisterButton(){
        clickOnElement(_registerButton);
    }
}
