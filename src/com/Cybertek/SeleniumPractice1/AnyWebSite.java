package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnyWebSite {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://khanacademy.org");

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#login-or-signup")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("uid-identity-text-field-2-email-or-username")).sendKeys("neverGiveUpGo");
        driver.findElement(By.cssSelector("[type='password']")).sendKeys("neverGiveUpGo");
        driver.findElement(By.cssSelector("button._1up6svzf")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[class='_1yr0d78l']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("allahim@mail.ru");
        driver.findElement(By.id("reset")).click();
        if(driver.getTitle().contains("Khan Academy")){
            System.out.println("I found it");
        }else{
            System.out.println("I could not find it");
        }
    }
}
