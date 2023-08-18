package com.tta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement choose_file = driver.findElement(By.xpath("//input[@id='fileToUpload']"));
        choose_file.sendKeys("C:\\Users\\SnehalYadav\\Downloads\\image5.png");
        WebElement upload_file_btn = driver.findElement(By.xpath("//input[@name='submit']"));
        upload_file_btn.click();
    }
}
