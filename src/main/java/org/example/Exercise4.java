package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.math.BigDecimal;
import java.util.List;

public class Exercise4 {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/register");
        Thread.sleep(500);

        driver.findElement(By.linkText("Books")).click();
        List<WebElement> listOfBooks = driver.findElements(By.className("product-item"));
        Thread.sleep(500);

        for (WebElement e : listOfBooks){
        Thread.sleep(500);
            System.out.println(e.findElement(By.className("product-title")).getText());
            System.out.println(e.findElement(By.className("actual-price")).getText());
            if (new BigDecimal(e.findElement(By.className("actual-price")).getText()).intValue() > 50){

                System.out.println(e.findElement(By.className("product-title")).getText() + " costs too much with " + e.findElement(By.className("actual-price")).getText() + " instead of 0-50.");
            }
        }

    }
}
