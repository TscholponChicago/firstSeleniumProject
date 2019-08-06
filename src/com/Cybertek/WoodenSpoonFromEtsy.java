package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenSpoonFromEtsy {
    /*
    PRACTICE : go to ETSY.com
                  search for wooden spoon
                  make sure title includes wooden spoon
                  expected result : verify wooden spoon

     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();//
        driver.manage().window().maximize();
        driver.get("https://etsy.com");
        driver.findElement(By.id("search-query")).sendKeys("wooden spoon"+ Keys.ENTER);
        driver.findElement(By.partialLinkText("register")).click();//
        if(driver.getTitle().contains("Wooden spoon")){
            System.out.println("Wooden spoon is found");
        }else{
            System.out.println("Wooden spoon is not found");
        }

    }
}
