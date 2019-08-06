package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleFindTest1 {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://google.com");
        String result = driver.getTitle();
        String exp = "Google";
        if(result.equals(exp)){
            System.out.println("Google title passed");
        }else{
            System.out.println("Google title failed");
        }

    }
}
