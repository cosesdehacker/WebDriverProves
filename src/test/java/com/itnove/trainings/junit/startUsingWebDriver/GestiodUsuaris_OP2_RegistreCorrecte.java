package com.itnove.trainings.junit.startUsingWebDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class GestiodUsuaris_OP2_RegistreCorrecte extends BaseTest {

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
        WebElement pestanyaRegister = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
        pestanyaRegister.click();
        //TS3
        Assert.assertTrue(!driver.getCurrentUrl().contentEquals("http://95.85.29.238/index.php?route=common/home"));
        //TS4
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
        firstName.click();
        //TS5
        firstName.sendKeys("Cristina");
        Thread.sleep(2000);
        //TS6
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
        lastName.click();
        //TS7
        lastName.sendKeys("Mathews");
        Thread.sleep(2000);
        //TS8
        WebElement quadreEmail = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        quadreEmail.click();
        //TS9
        quadreEmail.sendKeys("nasrodo@gmail.com");
        Thread.sleep(2000);
        //TS10
        WebElement quadreTelf = driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
        quadreTelf.click();
        //TS11
        quadreTelf.sendKeys("622222223");
        Thread.sleep(2000);
        //TS12
        WebElement quadrePassword = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        quadrePassword.click();
        //TS13
        quadrePassword.sendKeys("Password1");
        Thread.sleep(2000);
        //TS14
        WebElement quadreConfirmPassword = driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
        quadreConfirmPassword.click();
        //TS15
        quadreConfirmPassword.sendKeys("Password1");
        Thread.sleep(2000);
        //TS16
        WebElement newsletterYes = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
        newsletterYes.click();
        //TS17
        WebElement privacyPolicy = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
        privacyPolicy.click();
        Thread.sleep(2000);
        //TS18
        WebElement continuar = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
        continuar.click();
        //TS19
        Thread.sleep(10000);
        Assert.assertTrue(!driver.getCurrentUrl().contentEquals("http://95.85.29.238/index.php?route=account/register"));
        Thread.sleep(4000);

    }
}
