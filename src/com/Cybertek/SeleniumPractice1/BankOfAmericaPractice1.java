package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankOfAmericaPractice1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();//
        driver.manage().window().maximize();
        driver.get("http://bankofamerica.com");
        WebElement OnlineId = driver.findElement(By.name("onlineId1"));
        WebElement passCode = driver.findElement(By.name("passcode1"));
        WebElement signIn = driver.findElement(By.id("signIn"));
        String expectedOnlineId = "12345678910";
        OnlineId.sendKeys("12345678910");
        passCode.sendKeys("cholpon12345678910");
        signIn.click();

    }
}
