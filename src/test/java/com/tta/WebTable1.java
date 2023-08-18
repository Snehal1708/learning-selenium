package com.tta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable1 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://awesomeqa.com/webtable.html");
        //Table //table[@id = 'customers']
        //Row
        int row = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr[2]/td")).size();
        System.out.println(row);
        System.out.println(col);
        //Column
//        String first_part = "//table[@id = 'customers']/tbody/tr[";
        String first_part = "//table[@id =\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";
        for (int i = 2; i < row; i++) {
            for (int j = 1; j < col; j++) {
                String dynamic_xpath = first_part + i + second_part + j + third_part;
                String data = driver.findElement(By.xpath(dynamic_xpath)).getText();
                if (data.contains("Helen Bennet")) {
                    String country_path = dynamic_xpath + "/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("Helen Bennet is in " + country_text);

//                    System.out.println(data + " ");

                }
            }
        }
    }
}
