package com.tta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Selenium13 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
//        for (WebElement e : checkboxes) {
//            if (!e.isSelected()) {
//                e.click();
//            }
//        }
        WebElement checkbox1  = checkboxes.get(0);
        checkbox1.click();
    }
}
