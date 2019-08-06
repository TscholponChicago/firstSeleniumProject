package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookFakeOne {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
//        driver.findElement(By.id("email")).sendKeys("tralivali");
//        driver.findElement(By.id("pass")).sendKeys("tarata");
//        driver.findElement(By.cssSelector("[value='Log In']")).click();
//        Thread.sleep(5000);
//        driver.close();

        driver.findElement(By.name("firstname")).sendKeys("Monster");
        driver.findElement(By.name("lastname")).sendKeys("lalala");
        driver.findElement(By.name("reg_email__")).sendKeys("234234hdffgbjdhfb");
        driver.findElement(By.name("reg_passwd__")).sendKeys("6354jhdsgcjhxxgh");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(6000);

    }
}
