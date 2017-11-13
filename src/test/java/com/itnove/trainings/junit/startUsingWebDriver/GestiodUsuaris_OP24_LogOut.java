package com.itnove.trainings.junit.startUsingWebDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class GestiodUsuaris_OP24_LogOut extends BaseTest {

    @Test
    public void testApp() throws InterruptedException {

        //Login
        Utils.login(driver, "nasrodo@gmail.com", "Password1");

        //TS1
        WebElement iconaUsuari = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
        iconaUsuari.click();
        Thread.sleep(2000);
        //TS2
        WebElement pestanyaLogout = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
        pestanyaLogout.click();
        Assert.assertTrue(!driver.getCurrentUrl().contentEquals("http://opencart.votarem.lu/index.php?route=common/home"));
        //TS3
        WebElement desplegableUsuari = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul"));
        Assert.assertTrue(!desplegableUsuari.getText().contains("Login"));
        Thread.sleep(4000);

    }
}
