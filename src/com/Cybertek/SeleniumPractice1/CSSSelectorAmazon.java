package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*PRACTICE: Search Amazon
1.Open browser
2. Go to https://amazon.com
3. Enter any search term (use cssSelector to locate search box)
4.Verify title contains the search term
*/
public class CSSSelectorAmazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();//
        driver.manage().window().maximize();
        driver.get(" https://amazon.com");

//        WebElement amazonSearch = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
//        amazonSearch.sendKeys("water bottle"+ Keys.ENTER);






    }
}
