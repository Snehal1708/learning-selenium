package com.tta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Assignment03 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(2000);
        WebElement userNameInputBox = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userNameInputBox.sendKeys("admin");

        WebElement passwordInputBoxes = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordInputBoxes.sendKeys("Hacker@4321");

        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();

        Thread.sleep(2000);
        WebElement addEmpBtn = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
        addEmpBtn.click();
        Thread.sleep(1000);

        WebElement firstNameInput = driver.findElement(By.name("firstName"));
        firstNameInput.sendKeys("Snehal");

        WebElement middleNameInput = driver.findElement(By.name("middleName"));
        middleNameInput.sendKeys("Suresh");

        WebElement lastNameInput = driver.findElement(By.name("lastName"));
        lastNameInput.sendKeys("Yadav");
        Assert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/hr/web/index.php/pim/addEmployee");

        WebElement saveBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        saveBtn.click();
    }
}
