package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
//        driver.get("http://google.com");
//        System.out.println(driver.getCurrentUrl());
//        driver.get("http://amazon.com");
//        System.out.println(driver.getCurrentUrl());
     // driver.get("https://letskodeit.teachable.com");
      // driver.findElement(By.linkText("Login")).click();
      //  driver.findElement(By.linkText("Practice")).click();
      //  driver.findElement(By.linkText("Sign Up")).click();
     //   driver.findElement(By.linkText("Enroll now")).click();
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.linkText("View All Courses")).click();
       // driver.findElement(By.linkText("Terms of Use")).click();
        //driver.findElement(By.partialLinkText("Pra")).click();

       // driver.findElement(By.linkText("Complete Step By Step Java For Testers")).click();
//        String s = driver.findElement(By.linkText("Practice")).getText();
//        System.out.println(s);
//        String ss = driver.findElement(By.className("headline")).getText();
//        System.out.println(ss);
//        String ff = driver.findElement(By.className("powered-by")).getText();
//        System.out.println(ff);

     driver.get("http://amazon.com");
     Thread.sleep(5000);
   String ss = driver.findElement(By.cssSelector("#nav-cart .nav-line-2")).getText();
   driver.findElement(By.xpath("//a[@id='nav-cart']/span[@class='nav-line-2']"));
        System.out.println(ss);
        System.out.println(driver.findElement(By.className("nav-line-2")).getText());
        System.out.println(driver.findElement(By.className("nav-line-1")).getText());
        System.out.println(driver.findElement(By.className("icp-nav-language")).getText());
        System.out.println(driver.findElement(By.id("nav-cart-count")).getText());
        System.out.println(driver.findElement(By.xpath("//h2[@class='a-color-base headline truncate-1line']")).getText());
        System.out.println(driver.findElement(By.cssSelector("#desktop-grid-2 h2.a-color-base.headline.truncate-1line")).getText());

driver.close();

    }
}
