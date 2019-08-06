package com.Cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Create a new class and do all the action in that class.

*Test Case #1: Google Title Verification*
*1.* Open a chrome browser
*2.* Go to http://google.com
*3.* Verify title:

Expected: Google

Print out message if failed or passed.
*/
public class GoogleTitleVerificationStart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
//
        String result = driver.getTitle();
        String expectedTitle= "Google";
        if(result.equals(expectedTitle)){
            System.out.println("Google Title Verification Passed");
        }else{
            System.out.println("Google Title verification Failed");
        }




    }
}
