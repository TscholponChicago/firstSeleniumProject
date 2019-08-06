package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankAuthent {
    /*Basic authentication Zero bank
1.Open browser
2. Go to http://zero.webappsecurity.com/login.html
3. Get the attribute value of <a href=“”>forgot your password</a>
Expected contains “/forgot-password.html”
*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();//
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");


        //this is locating the forgot your password link, and printing its attribute value
        System.out.println(driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href"));
        if(driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href").contains("/forgot-password.html")){
            System.out.println("Link verification is passed");
            System.out.println("Link does not contain the expected value");
        }else{
            System.out.println("link Varification is failed");
            System.out.println("The link does not contain the expected value");
        }


    }
}






