package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*PRACTICE: Search Amazon
1.Open browser
2. Go to https://amazon.com
3. Enter any search term (use cssSelector to locate search box)
4.Verify title contains the search term
*/
public class cssSelectorPractice1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");
        WebElement amazonSearchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        amazonSearchBox.sendKeys("crayons"+ Keys.ENTER);
        String expectedInTitle = "crayons";

        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("title verification passed");
        }else{
            System.out.println("Title verification failed");
        }





    }
}
