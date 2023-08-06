package com.tta;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium03 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
//        options.addArguments("--start-maximized");
//        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver.get("https://sdet.live/");
//        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
//        System.out.println(driver.getTitle());
//        driver.get("https://sdet.club/");
//        options.setPageLoadStrategy(PageLoadStrategy.NONE);
//        driver.get("https://sdet.club/");
//        System.out.println(driver.getTitle());
//        driver.close();
        System.out.println(driver.getTitle());
        driver.quit();
        System.out.println(driver.getTitle());
    }
}
