package com.tta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class WebTable2 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://awesomeqa.com/webtable1.html");
        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        List<WebElement> rows_table = table.findElements(By.tagName("tr"));
        System.out.println(rows_table.size());
        for(int i=0;i<rows_table.size();i++){
            List<WebElement> col = rows_table.get(i).findElements(By.tagName("td"));
            for(WebElement e:col){
                if(e.getText().contains("Clock Tower Hotel")) {
                    System.out.println(e.getText());
                }
            }
        }
    }
}
