package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://amazon.com");
       // System.out.println(driver.findElement(By.linkText("Today's Deals")).getText());
//        System.out.println(driver.findElement(By.linkText("Try Prime")).getText());
//        driver.close();
//        String ss = driver.findElement(By.className("icp-nav-language")).getText();
//        System.out.println(ss);
//        System.out.println(driver.findElement(By.linkText("See more")).getAttribute("href"));
////        System.out.println(driver.findElement(By.linkText("Books")).getAttribute("href"));
//        System.out.println(driver.findElement(By.className("navFooterColHead")).getText());
//        System.out.println(driver.findElement(By.className("a-color-base")).getText());
//        System.out.println(driver.findElement(By.className("a-link-normal see-more truncate-1line")).getText());
       System.out.println("get just links");
        System.out.println(driver.findElement(By.className("nav_a")).getAttribute("href"));


        System.out.println(driver.findElement(By.linkText("Shop College Dorm Essentials")).getAttribute("href"));
        System.out.println(driver.findElement(By.linkText("Shop everything for a great year")).getAttribute("href"));

    }
}
