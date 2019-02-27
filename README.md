# lab2TS

Obiective:
-	Scrapping de informatie referitoare la un produs de pe un site eComerce, utilizind Selenium(Aliexpress.com)

Sarcini de lucru:
-	Alegerea unui website eComerce (Aliexpress.com) si a unui produs de pe acest site (nail brush) si de pastrat toate aceste produse si de prezentat consula sub forma de o lista(ordonata dupa pret in ordine crescatoare).

Codul sursa al programului:
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

Dependentele de care am avut nevoie:
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>groupId</groupId>
    <artifactId>lab2</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.14.0</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-chrome-driver</artifactId>
            <version>3.141.59</version>
        </dependency>

    </dependencies>

    
</project>

Rezultatul rularii programului poate fi urmarit accesind link-ul :
https://github.com/anagogu/lab2TS
 
Concluzii :
Pe parcursul efectuarii lucrarii de laborator obiectivele propuse au fost realizate cu succes.
Pentru realizarea acestei lucrari de laborator eu am ales site-ul Aliexpress.com. 
Iar pentru a obtie lista de elimente de pe pagina si afisarea acestora in consola am studiat listele , 
array-rile, ciclurile si functii precum : « next() », « getText() » in limbajul Java.
