package com.tta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.List;

public class Selenium09 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

        WebElement makeappBtn = driver.findElement(By.xpath("//a[@href='./profile.php#login']"));
        makeappBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

        List<WebElement> userNameInputBoxes = driver.findElements(By.xpath("//input[@placeholder = 'Username']"));
        userNameInputBoxes.get(1).sendKeys("John Doe");

        WebElement passwordInputBoxes = driver.findElement(By.xpath("//input[@id ='txt-password']"));
        passwordInputBoxes.sendKeys("ThisIsNotAPassword");

        WebElement loginBtn = driver.findElement(By.id("btn-login"));
        loginBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
    }
}
