package com.itnove.trainings.junit.startUsingWebDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GestiodUsuaris_OP9_LoginIncorrecte_WrongEmail extends BaseTest {

    @Test
    public void testApp() throws InterruptedException {
        //TS0
        driver.manage().window().fullscreen();
        driver.navigate().to("http://95.85.29.238/index.php?route=common/home");
        //TS1
        WebElement iconaUsuari = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]"));
        iconaUsuari.click();
        Thread.sleep(2000);
        //TS2
        WebElement pestanyaLogin = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
        pestanyaLogin.click();
        //TS3
        Assert.assertTrue(!driver.getCurrentUrl().contentEquals("http://95.85.29.238/index.php?route=common/home"));
        //TS4
        WebElement quadreEmail = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        quadreEmail.click();
        //TS5
        quadreEmail.sendKeys("nasrodo@hotmail.com");
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
        Thread.sleep(4000);

    }
}
