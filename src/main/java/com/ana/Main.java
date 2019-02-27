package com.ana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Root\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.manage().window().maximize(); // maximize the browser window

        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.className("close-layer")).click();
        driver.findElement(By.id("search-key")).sendKeys("nail brush");
        driver.findElement(By.className("search-button")).click();
        driver.findElement(By.id("price_lowest_1")).click();

        List<WebElement> allLinks = driver.findElements(By.id("hs-below-list-items"));
     //   List<WebElement> allLinks = driver.findElements(By.xpath("@class='history-item product' and //span[@class='price price-m']"));

        Iterator<WebElement> itr = allLinks.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next().getText());
        }
        
        Thread.sleep(5000);
        driver.quit();

    }
}
