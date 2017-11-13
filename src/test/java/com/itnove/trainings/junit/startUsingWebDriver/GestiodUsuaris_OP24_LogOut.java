package com.itnove.trainings.junit.startUsingWebDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class GestiodUsuaris_OP24_LogOut extends BaseTest {

    @Test
    public void testApp() throws InterruptedException {

        //TS0
        driver.manage().window().fullscreen();
        driver.navigate().to("http://95.85.29.238/index.php?route=common/home");

        driver.navigate().to("http://95.85.29.238/index.php?route=account/login");
        WebElement quadreEmail = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        quadreEmail.click();
        quadreEmail.sendKeys("nasrodo@gmail.com");
        WebElement quadrePassword = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        quadrePassword.click();
        quadrePassword.sendKeys("Password1");
        WebElement accept = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        accept.click();

        //TS1
        WebElement iconaUsuari = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
        iconaUsuari.click();
        Thread.sleep(2000);
        //TS2
        WebElement pestanyaLogout = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
        pestanyaLogout.click();
        Assert.assertTrue(!driver.getCurrentUrl().contentEquals("http://95.85.29.238/index.php?route=common/home"));
        //TS3
        WebElement desplegableUsuari = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul"));
        Assert.assertTrue(!desplegableUsuari.getText().contains("Login"));
        Thread.sleep(4000);

    }
}
