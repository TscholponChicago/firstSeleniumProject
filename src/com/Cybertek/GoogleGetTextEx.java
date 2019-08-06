package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleGetTextEx {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();//
        driver.manage().window().maximize();
        driver.get("http://google.com");
      //  System.out.println("Text of the Store link is: "+driver.findElement(By.linkText("Store")).getText());
        System.out.println(driver.findElement(By.linkText("About")).getText());
    }
}
