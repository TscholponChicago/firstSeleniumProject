package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifiyingURL {
    public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cybertekschool.com");
        if(driver.getCurrentUrl().contains("cybertekschool")){
            System.out.println("Cybertek URL passed");
        }else{
            System.out.println("Cybertek URL failed");
        }

    }
}
