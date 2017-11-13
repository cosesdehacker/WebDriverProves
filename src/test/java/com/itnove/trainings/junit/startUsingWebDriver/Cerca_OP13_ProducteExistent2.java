package com.itnove.trainings.junit.startUsingWebDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Cerca_OP13_ProducteExistent2 extends BaseTest {

    @Test
    public void testApp() throws InterruptedException {
        //TS0
        driver.manage().window().fullscreen();
        driver.navigate().to("http://opencart.votarem.lu/index.php?route=common/home");

        driver.navigate().to("http://opencart.votarem.lu/index.php?route=account/login");
        WebElement quadreEmail = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        quadreEmail.click();
        quadreEmail.sendKeys("nasrodo@gmail.com");
        WebElement quadrePassword = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        quadrePassword.click();
        quadrePassword.sendKeys("Password1");
        WebElement accept = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        accept.click();

        //TS1
        WebElement quadreCerca = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
        quadreCerca.click();
        Thread.sleep(8000);
        //TS2
        quadreCerca.sendKeys("samsung");
        WebElement lupa = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
        lupa.click();
        String URL = driver.getCurrentUrl();
        Assert.assertTrue(!URL.contentEquals("http://opencart.votarem.lu/index.php?route=common/home"));
        Thread.sleep(8000);
        //TS3
        WebElement quadreResultats = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]"));
        Assert.assertTrue(quadreResultats.getText().contains("Samsung"));
        //TS4
        WebElement quadreCercaDos = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
        quadreCercaDos.click();
        //TS5
        quadreCercaDos.clear();
        quadreCercaDos.sendKeys("htc");
        WebElement lupaDos = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
        lupaDos.click();
        Assert.assertTrue(!driver.getCurrentUrl().contentEquals(URL));
        Thread.sleep(6000);
        //TS6
        WebElement quadreResultatsDos = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]"));
        Assert.assertTrue(quadreResultatsDos.getText().contains("HTC"));
        Thread.sleep(8000);

        //TS0
        WebElement iconaUsuari = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]"));
        iconaUsuari.click();
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
        logout.click();

    }
}
