package com.Cybertek.SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IbrahimTypingRace {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinara\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//we use interface instaed of object, because later we can use that reference to create an object
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.get("http://play.typeracer.com");
        WebElement enterRaceLink = driver.findElement(By.linkText("Enter a typing race"));
        enterRaceLink.click();
        WebElement countdown = driver.findElement(By.cssSelector("div.popupContent span.time"));
        int countDown = Integer.parseInt(countdown.getText().substring(1));
        Thread.sleep(countDown+1 *1000);
        List<WebElement> textList = driver.findElements(By.xpath("//[span@unselectable='on']"));
        String text = "";
        for(WebElement t : textList)
            text += t.getText();
        System.out.println(text);

    }
}
