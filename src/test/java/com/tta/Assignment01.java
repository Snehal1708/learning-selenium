package com.tta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//Login to VWO.com
public class Assignment01 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://app.vwo.com/");

        WebElement userName = driver.findElement(By.id("login-username"));
        userName.sendKeys("93npu2yyb0@esiix.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Wingify@123");

//        WebElement signInBtn = driver.findElement(By.id("js-login-btn"));
        WebElement signInBtn = driver.findElement(By.xpath("//button[@data-qa=\"sibequkica\"]"));

        signInBtn.click();
        driver.quit();
    }
}
