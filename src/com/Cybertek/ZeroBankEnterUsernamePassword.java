package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Basic authentication Zero bank
1.Open browser
2. Go to http://zero.webappsecurity.com/login.html
3.Enter username: username
4.Enter password: password
5.Click sign in button
6.Verify username is displayed on page
7.Verify the title Zero - Account Summary
8.Verify the link Account Summary's href value contains: "account-summary"
    Print out results in validation format
*/
public class ZeroBankEnterUsernamePassword {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();//
        driver.manage().window().maximize();
        driver.get(" http://zero.webappsecurity.com/login.html");
        driver.findElement(By.name("user_login")).sendKeys("username");
        Thread.sleep(6000);
        driver.findElement(By.name("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();

        System.out.println(driver.findElement(By.xpath("//*[@id=\"settingsBox\"]/ul/li[3]/a")).getText());
       if(driver.findElement(By.xpath("//*[@id=\"settingsBox\"]/ul/li[3]/a")).getText().contains("username")){
           System.out.println("yes");

       }else{
           System.out.println("not");
       }

        driver.close();
      // if(driver.findElement(By.xpath("")))

    }
}
