package com.itnove.trainings.junit.startUsingWebDriver;

import com.itnove.trainings.junit.startUsingWebDriver.pages.searchPage.ResultsPage;
import com.itnove.trainings.junit.startUsingWebDriver.pages.searchPage.SearchPage;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;


public class provesgetText extends BaseTest {

    @Test
    public void testApp() throws InterruptedException {

        driver.navigate().to("http://www.duckduckgo.com");
        WebElement search = driver.findElement(By.xpath("//*[@id='search_form_input_homepage']"));
        search.click();
        //TS5
        search.sendKeys("funny unicorns");
        search.submit();
        //Assert.assertTrue(driver.getPageSource().contains("patata"));
        //System.out.println(search.getText());
        //Assert.assertTrue(search.getText().contentEquals("funny unicorns"));
        Thread.sleep(8000);

    }
}
