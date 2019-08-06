package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {
    public static void main(String[] args) {
        String baseURL ="http://google.com";
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinara\\documents\\selenium dependencies\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseURL);
    }
}
