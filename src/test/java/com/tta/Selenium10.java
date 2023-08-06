package com.tta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Selenium10 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        //By Tag
        WebElement headerText = driver.findElement(By.xpath("//h1"));
        //By Text
        //Exact Match
        WebElement headerText1 = driver.findElement(By.xpath("//a[text()=\"Make Appointment\"]"));
        //By Contains
        //Partial Match
        WebElement headerText2 = driver.findElement(By.xpath("//a[contains(text(),\"Make\")]"));
        //By attributes
        WebElement headerText3 = driver.findElement(By.xpath("//a[contains(@href,\"./profile.php#login\")]"));
        //By starts-with
        WebElement headerText4 = driver.findElement(By.xpath("//a[starts-with(@id,'btn-make-appointment')]"));
        WebElement headerText5 = driver.findElement(By.xpath("//a[text()=\"Make Appointment\" or @id='btn-make-appointment'] "));

        System.out.println(headerText.getText());
        System.out.println(headerText1.getText());
        System.out.println(headerText2.getText());
        System.out.println(headerText3.getText());
        System.out.println(headerText4.getText());
//        WebElement makeAppButton = driver.findElement(By.xpath("//*[@id=\"btn-make-appointment\"]"));
//        makeAppButton.click();
//        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        WebElement email_css_id = driver.findElement(By.xpath("//a[contains(text(),\"Make\")]"));

    }
}
