package org.example.explicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstExercise {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1?utm_source=chatgpt.com");

        WebElement startButton = driver.findElement(By.tagName("button"));
        startButton.click();
        WebElement helloWorld = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish h4")));
        System.out.println(helloWorld.getText().equals("Hello World!"));
    }
}
