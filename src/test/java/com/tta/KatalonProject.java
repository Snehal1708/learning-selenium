package com.tta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class KatalonProject {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.urlContains("https://katalon-demo-cura.herokuapp.com/profile.php#login"));
        List<WebElement> userNameInputBoxes = driver.findElements(By.xpath("//input[@placeholder = 'Username']"));
        userNameInputBoxes.get(1).sendKeys("John Doe");

        WebElement passwordInputBoxes = driver.findElement(By.xpath("//input[@id ='txt-password']"));
        passwordInputBoxes.sendKeys("ThisIsNotAPassword");

        WebElement loginBtn = driver.findElement(By.id("btn-login"));
        loginBtn.click();
        wait.until(ExpectedConditions.urlContains("appointment"));
        WebElement e = driver.findElement(By.xpath("//select[@id='combo_facility']"));
        Select select = new Select(e);
        select.selectByVisibleText("Hongkong CURA Healthcare Center");
        driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']")).click();
        driver.findElement(By.xpath("//input[@id='radio_program_medicaid']")).click();
        driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("17/08/2023");
        driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys("I want to meet you");
        driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
        wait.until(ExpectedConditions.urlContains("appointment.php#summary"));
        WebElement h1 = driver.findElement(By.xpath("//h2[normalize-space()='Appointment Confirmation']"));
        Assert.assertEquals(h1.getText(),"Appointment Confirmation");
        driver.quit();


    }
}
