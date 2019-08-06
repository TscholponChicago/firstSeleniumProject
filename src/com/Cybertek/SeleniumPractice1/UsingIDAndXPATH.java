package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDAndXPATH {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();//
        driver.manage().window().maximize();
        driver.get("https://learn.cybertekschool.com/login/canvas");
      //  driver.get("https://www.facebook.com/");
//        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc123");
      //  driver.findElement(By.xpath("//input[@value='Log In']")).click();
//       String str = driver.findElement(By.linkText("Create a Page")).getAttribute("href");
//        System.out.println(str);
//        if(driver.getTitle().equals("Facebook - Log In or Sign Up")){
//            System.out.println("Passed");
//        }else{
//            System.out.println("Failed");
//        }
        driver.findElement(By.id("global_nav_dashboard_link")).click();
        driver.findElement(By.id("okta-signin-username")).sendKeys("kgteacher2015@gmail.com");
        driver.findElement(By.id("okta-signin-password")).sendKeys("8888jkshfjhsggf");
        driver.findElement(By.id("okta-signin-submit")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input.button.button-primary")).click(); //esli u menya classname i est defis mejdu slovami,
        //to ya doljna udalit defis i postavit tochku vmesto etogo
      //  driver.findElement(By.cssSelector("#form60")).click(); esli u menya Id v instector on rabotaet tolko dla cssSelectora syntax #valueOfId



    }
}
