package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise12 {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        Thread.sleep(500);

        WebElement searchBox = driver.findElement(By.className("search-toggle-box-module-scss-module__ul1rLa__queryInput"));
        Thread.sleep(500);

        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();
        Thread.sleep(500);

        System.out.println(driver.getTitle());

        if (driver.getTitle().equalsIgnoreCase("Selenium WebDriver at DuckDuckGo")){
            System.out.println("New webpage title matches with expected!");
        }
    }
}
