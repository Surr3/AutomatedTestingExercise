package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise13 {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Form Authentication")).click();
        Thread.sleep(1000);

        if (driver.findElement(By.tagName("h2")).getText().equalsIgnoreCase("Login Page")){
            System.out.println("You are at login page!");
        }
        Thread.sleep(1000);

        driver.get("https://the-internet.herokuapp.com/");

    }
}
