package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise11 {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        Thread.sleep(500);

        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(500);

        driver.quit();
    }
}
