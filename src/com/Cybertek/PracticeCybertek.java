package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
PRACTICE#1
Go to : http://practice.cybertekschool.com/forgot_password
Enter email
Click “retrieve password” button
Make sure “Your e-mail's been sent!” message is displayed.
*/
public class PracticeCybertek {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");//go to

        //this is my version
//        driver.findElement(By.name("email")).sendKeys("cholpon@gmail.com");//enter email
//        driver.findElement(By.id("form_submit")).click();//

        // Gurhan's version
//to be able to enter email, I need to locate the input box
        WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));

        //locating the retrieve button here;
        WebElement retrieveButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //entering the email

        inputEmail.sendKeys("testemail@email.com");

        retrieveButton.click();

        //locating the message;

        WebElement emailMessage = driver.findElement(By.xpath("//div[@id='content']"));
        // WebElement emailMessage = driver.findElement(By.id("content"));

        if(emailMessage.isDisplayed()){
            System.out.println("Email message verification PASSED!");
        }else{
            System.out.println("Email message verification FAILED!!!");
        }

        //if I wanted make sure that the message inside is correct as well

        String emailMessageText = emailMessage.getText();

        if(emailMessageText.equals("Your e-mail's been sent!")){
            System.out.println("Email message text verification PASSED!");
        }else {
            System.out.println("Email message text verification FAILED!!!");
        }






    }

}