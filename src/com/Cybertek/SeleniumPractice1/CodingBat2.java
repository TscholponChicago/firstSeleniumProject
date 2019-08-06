package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodingBat2 {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://codingbat.com/java");
       // driver.findElement(By.cssSelector("['/pref?docreate=1']")).click();

        driver.findElement(By.name("uname")).sendKeys("cybertek2019@gmail.com");
        driver.findElement(By.name("pw")).sendKeys("cybertek2019");
        driver.findElement(By.name("dologin")).click();
        Thread.sleep(2000L);
//        driver.findElement(By.cssSelector("input.h2")).click();
//        Thread.sleep(2000L);
//        driver.findElement(By.cssSelector("[href='/prob/p175689']")).click();
//        Thread.sleep(2000L);
//        driver.findElement(By.cssSelector("['/prob/p175689']")).click();
       // driver.findElement(By.cssSelector("[href='/logout']")).click();
        Thread.sleep(2000L);
        driver.close();


    }

}
