package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchVerification {
    /*Test Case #4: Google Search
1. Open browser chrome
2. Go to website http://google.com
3. Write "apple" in search box
4. Click google search button
5. Verify Title:
    Expected: Title should start with "apple" word
    */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com/");

       driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(2000);
        driver.findElement(By.name("btnk")).click();


         if(driver.getTitle().startsWith("apple")){ //we cannot use ignorecase method
             System.out.println("The title starts with apple");
         }else{
             System.out.println("title does not starts with apple");
         }


    }
}
