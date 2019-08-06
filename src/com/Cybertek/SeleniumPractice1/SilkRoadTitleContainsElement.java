package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SilkRoadTitleContainsElement {
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

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://sris.edu.kg");
        driver.findElement(By.linkText("ABOUT SRIS")).click();
        if(driver.getTitle().contains("History")){
            System.out.println("ABOUT SRIS Title contains History. ");
        }else{
            System.out.println("ABOUT SRIS Title does not contain History ");
        }
        driver.navigate().back();
        Thread.sleep(10000);
    }
}
