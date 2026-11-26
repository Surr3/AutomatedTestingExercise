package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise6 {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://boardgamegeek.com/");
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body//div/div/div[1]/div/label/input")).click();
    }
}
