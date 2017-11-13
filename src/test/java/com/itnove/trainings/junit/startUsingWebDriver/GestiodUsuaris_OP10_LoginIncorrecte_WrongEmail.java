package com.itnove.trainings.junit.startUsingWebDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GestiodUsuaris_OP10_LoginIncorrecte_WrongEmail extends BaseTest {

    @Test
    public void testApp() throws InterruptedException {
        //TS0
        driver.manage().window().fullscreen();
        driver.navigate().to("http://95.85.29.238/index.php?route=account/login");
        //TS1
        WebElement quadreEmail = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        quadreEmail.click();
        //TS2
        quadreEmail.sendKeys("nasrodo@hotmail.com");
        Thread.sleep(2000);
        //TS3
        WebElement quadrePassword = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        quadrePassword.click();
        //TS4
        quadrePassword.sendKeys("Password1");
        Thread.sleep(2000);
        //TS5
        WebElement accept = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        accept.click();
        Thread.sleep(4000);

    }
}
