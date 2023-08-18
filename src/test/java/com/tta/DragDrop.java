package com.tta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver();
        String URL = "https://the-internet.herokuapp.com/drag_and_drop";
        driver.get(URL);
        //Actions class method to drag and drop
        Actions builder = new Actions(driver);
        WebElement from = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement to = driver.findElement(By.xpath("//div[@id='column-b']"));
        //Perform drag and drop
        builder.dragAndDrop(from, to).build().perform();
        Thread.sleep(2000);

    }
}
