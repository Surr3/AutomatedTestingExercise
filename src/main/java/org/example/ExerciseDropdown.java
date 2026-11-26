package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.WatchEvent;

public class ExerciseDropdown {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select dropDown = new Select(driver.findElement(By.id("dropdown")));
        Thread.sleep(1000);
        dropDown.selectByVisibleText("Option 1");
        Thread.sleep(1000);
        dropDown.selectByVisibleText("Option 2");
        Thread.sleep(1000);
        System.out.println("Get first Selected Option: " + dropDown.getFirstSelectedOption().getText());


    }
}
