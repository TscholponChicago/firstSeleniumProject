package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest1Toys {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://amazon.com");
//        Thread.sleep(3000);
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys for girls 6 years old"+ Keys.ENTER);
//        driver.findElement(By.cssSelector("['nav-input']"));
//        Thread.sleep(4000);
//        driver.findElement(By.cssSelector("a-size-base-plus a color-base a-text-normal")).click();
//        driver.findElement(By.id("add-to-cart-button")).click();
//        driver.findElement(By.cssSelector("['a-button-input']")).click();
//
//        driver.findElement(By.name("password")).sendKeys("chopita");
//        driver.findElement(By.cssSelector("['signInSubmit']")).click();
//        Thread.sleep(5000);
//        driver.close();
       // WebElement searchButton = driver.findElement(By.xpath("twotabsearchtextbox"));
       // searchButton.sendKeys("water bottle"+ Keys.ENTER);
        driver.findElement(By.linkText("dns-prefetch"));
        System.out.println();
    }
}
