package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

public class ThirdExercise {
    @Test
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2?utm_source=chatgpt.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement visibleHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish h4")));

        Object assertEquals = null;
        Object assertEquals1 = assertEquals;

    }
}
