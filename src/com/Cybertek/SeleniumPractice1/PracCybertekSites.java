package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracCybertekSites {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        String homelInkText = homeLink.getText();
        if(homeLink.isDisplayed() && homeLink.equals("Home")){
            System.out.println("Home lik verification passed");
        }else{
            System.out.println("Homelink verification failed");
        }


        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//div[@class='example']/h2"));
        String forgotPasswordText = forgotPasswordHeader.getText();
        if(forgotPasswordHeader.isDisplayed()&& forgotPasswordText.equals("Forgot Password")){
            System.out.println("Forgot password header verification passed");
        }else{
            System.out.println("Forgot password header verification failed");
        }

        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));
        String emailLabelText = emailLabel.getText();

        if(emailLabel.isDisplayed()&& emailLabelText.equals("E-mail")){
            System.out.println("Email verification passed");
        }else{
            System.out.println("Email verification failed");
        }
        WebElement inputEmailBox = driver.findElement(By.xpath("//input[@type='text']"));
        if(inputEmailBox.isDisplayed()){
            System.out.println("Input verification passed");
        }else{
            System.out.println("Input failed");
        }
        WebElement retrivePasswordButton = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        String retrivePassword = retrivePasswordButton.getText();



    }
}
