/*package com.itnove.trainings.junit.startUsingWebDriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

public class LoginTest {
    public RemoteWebDriver driver;

    @Before
    public void setUp() throws IOException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver", "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "chromedriver-macos");
        driver = new ChromeDriver(capabilities);

        driver.navigate().to("http://95.85.29.238/index.php?route=account/login");
        WebElement quadreEmail = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        quadreEmail.click();
        quadreEmail.sendKeys("nasrodo@gmail.com");
        WebElement quadrePassword = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        quadrePassword.click();
        quadrePassword.sendKeys("Password1");
        WebElement accept = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        accept.click();
    }

    @After
    public void tearDown() {

        WebElement iconaUsuari = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]"));
        iconaUsuari.click();
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
        logout.click();

        driver.quit();
    }

}*/
