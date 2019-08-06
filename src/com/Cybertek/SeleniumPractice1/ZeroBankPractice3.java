package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
8.Verify the link Account Summary’s href value contains: “account-summary”
   Print out results in validation format
*/
public class ZeroBankPractice3 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();//
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        //locate inputUsername
        WebElement inputUsername =driver.findElement(By.id("user_login"));
        WebElement inputPassword = driver.findElement(By.id("user_password"));
        String insertUsername = "username";
        String inserPassword = "password";
        inputUsername.sendKeys(insertUsername);
        inputPassword.sendKeys(inserPassword);
        WebElement clickSumbit = driver.findElement(By.name("submit"));
        clickSumbit.click();

      WebElement actualProfileUsername = driver.findElement(By.linkText("username"));
      String actualUsernameText = actualProfileUsername.getText();
      if(actualProfileUsername.isDisplayed()){
          System.out.println("Username is displayed");
      }else{
          System.out.println("Username is not displayed");
      }

    String title = driver.getTitle();
    if(title.equals("Zero - Account Summary")){
        System.out.println("Title is found");
    }else{
        System.out.println("Title is not found");
    }
     String linkText=  driver.findElement(By.xpath("//*[@id=\"account_summary_tab\"]/a")).getAttribute("href");
     if(linkText.contains("account-summary")){
         System.out.println("href is found");
     }else{
         System.out.println("href is not found");
     }


     String expectedHref = "index";
     WebElement zeroBankLink = driver.findElement(By.linkText("Zero Bank"));
     String actualHrefValue = zeroBankLink.getAttribute("href");
     if(actualHrefValue.contains(expectedHref)){
         System.out.println("expected href is found");
     }else{
         System.out.println("expected href is not here");
     }



    driver.close();





    }
}
