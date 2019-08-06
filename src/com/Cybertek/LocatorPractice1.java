package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Cybertek Practice:
//        Go to : http://practice.cybertekschool.com/forgot_password
//        Locate every single webelement on this page using xpath.
//        Make sure they are all displayed.

public class LocatorPractice1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password ");
        //locate the homelink
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        String homeLinkText = homeLink.getText();

        if(homeLink.isDisplayed() && homeLinkText.equals("Home")){
            System.out.println("Home link verification passed!");
        }else{
            System.out.println("Home link verification FAILED!");
            System.out.println("Either text is not matching or link is not displayed!");
        }

        //locate forgot password
        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//div[@class='example']/h2"));
        String forgotPasswordHeaderText = forgotPasswordHeader.getText();

        if(forgotPasswordHeader.isDisplayed() && forgotPasswordHeaderText.equals("Forgot Password")){
            System.out.println("Forgot password header verification passed!");
        }else{
            System.out.println("Forgot password header verification failed!");
        }

        //locate email label
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));
        String emailLabelText = emailLabel.getText();

        if(emailLabel.isDisplayed() && emailLabelText.equals("E-mail")){
            System.out.println("Email label verification passed!!");
        }else{
            System.out.println("Email label verification failed!!!");
        }

        //locate input emailbox
        WebElement inputEmailBox = driver.findElement(By.xpath("//input[@type='text']"));

        if(inputEmailBox.isDisplayed()){
            System.out.println("Input email box verification passed!");
        }else{
            System.out.println("Input email box verification failed!!!");
        }

        //locate retrive password button
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
        String retrievePassButText = retrievePasswordButton.getText();

        if(retrievePasswordButton.isDisplayed() && retrievePassButText.equals("Retrieve password")){
            System.out.println("Button verification passed!");
        }else{
            System.out.println("Button verification failed!!!");
        }

        //locate powered by cybertek


        WebElement cybertekFootnote = driver.findElement(By.xpath("//div[contains(@style, 'text-align')]"));
        String cybertekFootnoteText = cybertekFootnote.getText();

        if(cybertekFootnote.isDisplayed() && cybertekFootnoteText.equals("Powered by Cybertek School")){
            System.out.println("Footnote verification passed!!");
        }else{
            System.out.println("Footnote verification failed!!!");
        }




    }
}
