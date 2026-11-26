package org.example.ListExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChallengingDOM {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> allButtons = driver.findElements(By.tagName("button"));
        WebElement blueButtons = driver.findElement(By.cssSelector("button.blue"));
        WebElement redButtons = driver.findElement(By.cssSelector("button.red"));
        WebElement table = driver.findElement(By.cssSelector("#content"));
        List<WebElement> allTableHeaders = driver.findElements(By.cssSelector("#content h1"));
        List<WebElement> allLinks = driver.findElements(By.cssSelector("#content a"));

        List<WebElement> linksWithHREFedit = driver.findElements(By.cssSelector("a[href*='edit']"));
        List<WebElement> hrefWithEditAndDelete = driver.findElements(By.cssSelector("a[href*='edit'][href*='delete']"));




        
    }
}
