package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdamyTest1 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinara\\documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("http://google.com");

//        driver.findElement(By.name("q")).sendKeys("udamy"+ Keys.ENTER);
//        driver.get("http://www.udemy.com");
//        driver.findElement(By.linkText("button")).click();
//        driver.findElement(By.name("email")).sendKeys("allahim@mail.ru");
//        driver.findElement(By.name("password")).sendKeys("meiner");
//        driver.findElement(By.cssSelector("['Log In']")).click();
        //  driver.findElement(By.name("q")).sendKeys("letskodeit");
         // driver.findElement(By.name("btnk")).click();
        driver.findElement(By.name("q")).sendKeys("letskodeit"+ Keys.ENTER);
        driver.findElement(By.className("LC20lb")).click();
        driver.close();



    }
}
