package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class codingBat {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://codingbat.com/java");
        driver.findElement(By.name("uname")).sendKeys("cholpon");
        driver.findElement(By.name("pw")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.name("dologin")).click();
       // driver.close();














//        driver.findElement(By.name("uname")).sendKeys("cybertek2019@gmail.com");
//        driver.findElement(By.name("pw")).sendKeys("cybertek2019");
//
//        driver.findElement(By.name("dologin")).click();
//        if(driver.getTitle().contains("CodingBat")){
//            System.out.println("I got a coding bat account");
//        }else{
//            System.out.println("I don't have an account in Coding Bat");
//        }


    }
}
