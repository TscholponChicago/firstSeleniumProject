package com.Cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
Methods in selenium and their functionalities

*/




public class FirstSelenium {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("https://www.firefox.com/");//this line is navigateing
        driver.navigate().back();//it will bring me back to driver fox
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.getCurrentUrl();//getting the current url and return is as string,
        System.out.println(driver.getPageSource());// this method retrun html page source as string
        driver.manage().window().maximize();//
        driver.manage().window().fullscreen();//makes chrome instance full screen
        driver.close();//it closes the opend browser instance
    }
}
