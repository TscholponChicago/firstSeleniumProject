package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*ZEROBANK PRACTICE #1
Basic authentication: Zero bank
1.Open browser
2. Go to http://zero.webappsecurity.com/login.html
3. Get the text of “Log in to ZeroBank” find by className
Expected “Log in to ZeroBank”
*/
public class ZeroBankPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();//
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        //locate inputUsername
        WebElement inputUsername = driver.findElement(By.id("user_login"));
        //locate inputPassword
        WebElement inputPassword = driver.findElement(By.id("user_password"));
        //locate signIn button
        WebElement signInButton = driver.findElement(By.name("submit"));

        String expectedUsername = "username";

        inputUsername.sendKeys(expectedUsername);

        inputPassword.sendKeys("password");

        signInButton.click();

        //locating profileUsername
        WebElement actualProfileUsername = driver.findElement(By.linkText("username"));
        String actualUsernameText  = actualProfileUsername.getText();

        if(actualUsernameText.contains(expectedUsername)){
            System.out.println("Username verification PASSED!");
        }else{
            System.out.println("Username vefication FAILED!!!");
        }

        String expectedTitle = "Zero - Account Summary";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        String expectedInHref = "account-summary";

        //locate accountSummaryLink
        WebElement accountSummaryLink = driver.findElement(By.linkText("Account Summary"));
        String actualHrefValue = accountSummaryLink.getAttribute("href");

        if(actualHrefValue.contains(expectedInHref)){
            System.out.println("Expected HREF is inside of the Actual HREF!");
            System.out.println("HREF verificaiton PASSED!");
        }else{
            System.out.println("Expected HREF is NOT inside of the Actual HREF!!!");
            System.out.println("HREF verification FAILED!!!");
        }



        //System.out.println(driver.findElement(By.className("page-header")).getText());// it gets just text




    }
}
