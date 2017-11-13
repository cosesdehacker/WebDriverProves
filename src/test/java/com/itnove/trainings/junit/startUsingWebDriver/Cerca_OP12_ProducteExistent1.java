package com.itnove.trainings.junit.startUsingWebDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Cerca_OP12_ProducteExistent1 extends BaseTest {

    @Test
    public void testApp() throws InterruptedException {
        //TS0
        driver.manage().window().fullscreen();
        driver.navigate().to("http://95.85.29.238/index.php?route=common/home");
        //TS1
        WebElement quadreCerca = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
        quadreCerca.click();
        Thread.sleep(8000);
        //TS2
        quadreCerca.sendKeys("MacBook");
        WebElement lupa = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
        lupa.click();
        String URL = driver.getCurrentUrl();
        Assert.assertTrue(!URL.contentEquals("http://95.85.29.238/index.php?route=common/home"));
        Thread.sleep(8000);
        //TS3
        WebElement quadreResultats = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]"));
        Assert.assertTrue(quadreResultats.getText().contains("MacBook"));
        //TS4
        WebElement quadreCercaDos = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
        quadreCercaDos.click();
        //TS5
        quadreCercaDos.clear();
        quadreCercaDos.sendKeys("Canon");
        WebElement lupaDos = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
        lupaDos.click();
        Assert.assertTrue(!driver.getCurrentUrl().contentEquals(URL));
        Thread.sleep(6000);
        //TS6
        WebElement quadreResultatsDos = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]"));
        Assert.assertTrue(quadreResultatsDos.getText().contains("Canon"));
        Thread.sleep(8000);

    }
}
