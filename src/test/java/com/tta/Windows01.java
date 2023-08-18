package com.tta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class Windows01 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        String mainWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
// Iterate through the list of window handles
        for (String handle : windowHandles) {
// Switch the focus to each window in turn
            driver.switchTo().window(handle);
// Check if the text "New Window" is present in the window
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("The text 'New Window' was found in the new window.");
                break;
            }
        }
        driver.switchTo().window(mainWindowHandle);
        System.out.println("I am on main window");
        Thread.sleep(3000);
        driver.quit();
    }
}
