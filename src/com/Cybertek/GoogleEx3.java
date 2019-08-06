package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleEx3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();//
        driver.manage().window().maximize();
        driver.get("https://google.com");

        WebElement googleSearch = driver.findElement(By.name("q"));//everytime when we want to use google search we can use it
        googleSearch.sendKeys("book"+Keys.ENTER);

    }
}
