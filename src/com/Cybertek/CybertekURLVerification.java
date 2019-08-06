package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
*Test Case #3: Back and forth navigation*
1. Open a chrome browser
2. Go to : https://google.com
3. Click to Gmail from top right.
4. Verify title contains:
   Expected: Gmail
5. Go back to Google by using the .back();
6. Verify title contains:
   Expected: Google
7. Go back to Gmail using the Forward button
8. Verify title contains:
   Expected: Gmail

Print out message if failed or failed
 */

public class CybertekURLVerification {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://google.com");

        driver.findElement(By.linkText("Gmail")).click();// means find this element Gmail when you find it click on it
        if(driver.getTitle().contains("Gmail")){
            System.out.println("Gmail title verification passed");
        }else{
            System.out.println("Gmail title verification failed");
        }
        driver.navigate().back();

        Thread.sleep(8000);

        if(driver.getTitle().contains("Google")){
            System.out.println("Google title verification passed");
        }else{
            System.out.println("Google title verifications failed");
        }
        driver.navigate().forward();
        Thread.sleep(9000);
        if(driver.getTitle().contains("Gmail")){
            System.out.println("Gmail title verification passed again");
        }else{
            System.out.println("Gmail title verification failed again");
        }
    }
}
