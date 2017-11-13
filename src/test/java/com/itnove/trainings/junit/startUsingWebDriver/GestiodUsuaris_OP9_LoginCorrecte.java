package com.itnove.trainings.junit.startUsingWebDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class GestiodUsuaris_OP9_LoginCorrecte extends BaseTest {

    @Test
    public void testApp() throws InterruptedException {
        //TS0
        driver.manage().window().fullscreen();
        driver.navigate().to("http://opencart.votarem.lu/index.php?route=common/home");
        //TS1
        WebElement iconaUsuari = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]"));
        iconaUsuari.click();
        Thread.sleep(2000);
        //TS2
        WebElement pestanyaLogin = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
        pestanyaLogin.click();
        //TS3
        Assert.assertTrue(!driver.getCurrentUrl().contentEquals("http://opencart.votarem.lu/index.php?route=common/home"));
        //TS4
        WebElement quadreEmail = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        quadreEmail.click();
        //TS5
        quadreEmail.sendKeys("nasrodo@gmail.com");
        Thread.sleep(2000);
        //TS6
        WebElement quadrePassword = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        quadrePassword.click();
        //TS7
        quadrePassword.sendKeys("Password1");
        Thread.sleep(2000);
        //TS8
        WebElement login = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        login.click();
        //TS9
        Thread.sleep(10000);
        Assert.assertTrue(!driver.getCurrentUrl().contentEquals("http://opencart.votarem.lu/index.php?route=account/login"));
        Thread.sleep(4000);

    }
}
