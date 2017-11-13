package com.itnove.trainings.junit.startUsingWebDriver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;


public class BaseTest {
    public static RemoteWebDriver driver;

    @BeforeClass
    public static void setUp() throws IOException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver", "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "chromedriver-linux");
        driver = new ChromeDriver(capabilities);
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
