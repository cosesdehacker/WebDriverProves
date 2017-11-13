package com.itnove.trainings.junit.startUsingWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {

    public static void login(WebDriver driver, String email, String password){
        //TS0
        driver.manage().window().fullscreen();
        driver.navigate().to("http://opencart.votarem.lu/index.php?route=common/home");
        driver.navigate().to("http://opencart.votarem.lu/index.php?route=account/login");
        WebElement quadreEmail = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        quadreEmail.click();
        quadreEmail.sendKeys(email);
        WebElement quadrePassword = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        quadrePassword.click();
        quadrePassword.sendKeys(password);
        WebElement accept = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        accept.click();
    }
}
