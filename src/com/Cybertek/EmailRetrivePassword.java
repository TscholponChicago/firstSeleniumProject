package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailRetrivePassword {
    /*Retrieve password Task
1.Open browser
2. Go to https://the-internet.herokuapp.com/forgot_password
3. Enter any email
4. Click on Retrieve password
5.Verify url contains email_sent
*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();//
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/forgot_password");
        // finding the email input box, sending the keys
        driver.findElement(By.id("email")).sendKeys("email");

        //finding the button , and clicking on it
        driver.findElement(By.id("form_submit")).click();
        if(driver.getCurrentUrl().contains("email_sent")){ // means : if this link/ url contains email_send
            System.out.println("Link verification is passed");
        }else{
            System.out.println("Link verification failed");
        }
    }
}







