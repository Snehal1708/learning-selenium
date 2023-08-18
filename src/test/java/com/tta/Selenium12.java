package com.tta;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Selenium12 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
//        WebElement simpleAlert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
//        simpleAlert.click();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert1 = driver.switchTo().alert();
//        System.out.println(alert1.getText());
//        alert1.accept();
//        String result1 = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result1,"You successfully clicked an alert");

//        WebElement confirmOKAlert = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
//        confirmOKAlert.click();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert2 = driver.switchTo().alert();
//        System.out.println(alert2.getText());
//        alert2.accept();
//        String result2 = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result2,"You clicked: Ok");

//        WebElement confirmCancelAlert = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
//        confirmOKAlert.click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert2 = driver.switchTo().alert();
//        System.out.println(alert2.getText());
//        alert2.dismiss();
//        String result2 = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result2, "You clicked: Cancel");

        WebElement promptAlert = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        promptAlert.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("Snehal");
        alert2.accept();
        String result2 = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result2, "You clicked: Ok");
        Assert.assertEquals(result2, "You entered: Snehal");
    }
}
