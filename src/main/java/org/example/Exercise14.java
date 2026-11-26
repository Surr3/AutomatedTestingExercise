package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise14 {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Form Authentication")).click();
        Thread.sleep(1000);

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("Test");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Test123");

        Thread.sleep(1000);
        driver.findElement(By.id("username")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys("Test123");

        if (username.getAttribute("value").equalsIgnoreCase("Test123")){
            System.out.println("Correct username!");
        }
        if (password.getAttribute("value").equalsIgnoreCase("Test123")){
            System.out.println("Correct username!");
        }
        Thread.sleep(1000);

    }
}
