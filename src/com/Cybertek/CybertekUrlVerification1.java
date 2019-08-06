package com.Cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
*Test Case #2: Cybertek URL verification*
1. Open a chrome browser
2. Go to : https://cybertekschool.com/
3. Verify URL contains:

Expected: cybertekschool

Print out message if failed or passed.
 */
public class CybertekUrlVerification1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://cybertekschool.com");

        if(driver.getCurrentUrl().contains("cybertekschool")){
            System.out.println("Cybertek Url Verification passed");
        }else{
            System.out.println("Cybertek url verification failed");
        }
    }
}
