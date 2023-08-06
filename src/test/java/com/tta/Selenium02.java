package com.tta;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Selenium02 {
    public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver","src/main/java/com/resorces/drivers/geckodriver-v0.33.0-win32/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--headless=new");
        System.out.println(driver.getTitle());

        driver.get("https://sdet.club/live");
        options.addExtensions(new File("com/resources/extensions/gighmmpiobklfepjocnamgkkbiglidom-5.8.1-Crx4Chrome.com.crx"));
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
