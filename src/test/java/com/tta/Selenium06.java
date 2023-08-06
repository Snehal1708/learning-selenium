package com.tta;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Selenium06 {
    ChromeOptions options;
    WebDriver driver;
    @BeforeSuite
    public void setup(){
        options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.navigate().to("https://app.vwo.com/");
    }
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("TC#1 Verify user should not get login if username/password is invalid")
    public void invalidLoginTest() throws InterruptedException {
        WebElement userName = driver.findElement(By.id("login-username"));
        userName.sendKeys("93npu2yyb0@esiix.com-co");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Wingify@123");

        WebElement signInBtn = driver.findElement(By.id("js-login-btn"));
        signInBtn.click();
        Thread.sleep(2000);
        String errorMessage = driver.findElement(By.className("notification-box-description")).getText();
        Assert.assertEquals(errorMessage,"Your email, password, IP address or location did not match");
    }
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("TC#2 Verify user should get login with valid username/password")
    public void validLoginTest() throws InterruptedException {
        WebElement userName = driver.findElement(By.id("login-username"));
        userName.clear();
        userName.sendKeys("93npu2yyb0@esiix.com");

        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("Wingify@123");

        WebElement signInBtn = driver.findElement(By.id("js-login-btn"));
        signInBtn.click();
        Thread.sleep(5000);

        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/dashboard");
        Assert.assertEquals(driver.getTitle(),"Dashboard");
    }

}
