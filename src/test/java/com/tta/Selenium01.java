package com.tta;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {
    public static void main(String[] args) {
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://sdet.club/live");
    }
}
