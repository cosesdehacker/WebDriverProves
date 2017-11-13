package com.itnove.trainings.junit.startUsingWebDriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class GestiodUsuaris_OP8_RegistreIncorrecte_ConfirmPassword extends BaseTest {

    @Test
    public void testApp() throws InterruptedException {
        //TS0
        driver.manage().window().fullscreen();
        driver.navigate().to("http://opencart.votarem.lu/index.php?route=account/register");
        //TS1
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
        firstName.click();
        //TS2
        firstName.sendKeys("Cris");
        Thread.sleep(2000);
        //TS3
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
        lastName.click();
        //TS4
        lastName.sendKeys("Matthews");
        Thread.sleep(2000);
        //TS5
        WebElement quadreEmail = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        quadreEmail.click();
        //TS6
        quadreEmail.sendKeys("crismatthews@gmail.com");
        Thread.sleep(2000);
        //TS7
        WebElement quadreTelf = driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
        quadreTelf.click();
        //TS8
        quadreTelf.sendKeys("633333333");
        Thread.sleep(2000);
        //TS9
        WebElement quadrePassword = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        quadrePassword.click();
        //TS10
        quadrePassword.sendKeys("Password1");
        Thread.sleep(2000);
        //TS11
        WebElement quadreConfirmPassword = driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
        quadreConfirmPassword.click();
        //TS12
        quadreConfirmPassword.sendKeys("Password2");
        Thread.sleep(2000);
        //TS13
        WebElement newsletterYes = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
        newsletterYes.click();
        //TS14
        WebElement privacyPolicy = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
        privacyPolicy.click();
        Thread.sleep(2000);
        //TS15
        WebElement continuar = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
        continuar.click();
        Thread.sleep(10000);

    }
}
