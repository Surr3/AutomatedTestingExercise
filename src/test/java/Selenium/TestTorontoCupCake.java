package Selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTorontoCupCake {
    @Test
    public void testChocoHazeIncludes() throws InterruptedException {
        String expected = "Toronto Cupcake | Your Shopping Cart";
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.torontocupcake.com/");

        wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(".cky-btn-accept")))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector("a.order-now-btn")))).click();

        WebElement chocoHazelnut = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#qty_ChocolateHazelnut"))));
        chocoHazelnut.clear();
        chocoHazelnut.sendKeys("2");
        driver.findElement(By.cssSelector("#Chocolate-Hazelnut-ret input[type*='ubmi']")).click();

        String actual = driver.getTitle();
        System.out.println(actual);

        assertEquals(expected,actual);
        driver.quit();
    }
    @Test
    public void testChocoHazeStartsWith() throws InterruptedException {
        String expected = "Toronto Cupcake | Your Shopping Cart";
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.torontocupcake.com/");

        wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(".cky-btn-accept")))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector("a.order-now-btn")))).click();

        WebElement chocoHazelnut = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#qty_ChocolateHazelnut"))));
        chocoHazelnut.clear();
        chocoHazelnut.sendKeys("2");
        driver.findElement(By.cssSelector("#Chocolate-Hazelnut-ret input[type^='sub']")).click();

        String actual = driver.getTitle();
        System.out.println(actual);

        assertEquals(expected,actual);
        driver.quit();
    }
    @Test
    public void testChocoHazeEndsWith() throws InterruptedException {
        String expected = "Toronto Cupcake | Your Shopping Cart";
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.torontocupcake.com/");

        wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(".cky-btn-accept")))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector("a.order-now-btn")))).click();

        WebElement chocoHazelnut = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#qty_ChocolateHazelnut"))));
        chocoHazelnut.clear();
        chocoHazelnut.sendKeys("2");
        driver.findElement(By.cssSelector("#Chocolate-Hazelnut-ret input[type$='mit']")).click();

        String actual = driver.getTitle();
        System.out.println(actual);

        assertEquals(expected,actual);

        driver.quit();
    }
}
