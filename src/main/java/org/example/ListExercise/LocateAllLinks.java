package org.example.ListExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateAllLinks {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> allLinks = driver.findElements(By.cssSelector("#content a"));
        WebElement directLink = driver.findElement(By.cssSelector("ul > li"));
        WebElement firstList = driver.findElement(By.cssSelector("ul li:first-of-type"));
        WebElement lastList = driver.findElement(By.cssSelector("ul li:last-of-type"));
        WebElement every3rdList = driver.findElement(By.cssSelector("ul li:nth-of-type(3n)"));
        List<WebElement> allDynamicLists = driver.findElements(By.cssSelector("a[href*='dynamic']"));

    }
}
