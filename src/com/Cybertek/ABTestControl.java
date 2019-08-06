package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
/*ZEROBANK PRACTICE #1
Basic authentication: Zero bank
1.Open browser
2. Go to http://zero.webappsecurity.com/login.html
3. Get the text of “Log in to ZeroBank” find by className
Expected “Log in to ZeroBank”
*/
public class ABTestControl {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/abtest");
        driver.findElement(By.className("example")).getText();


    }
}
