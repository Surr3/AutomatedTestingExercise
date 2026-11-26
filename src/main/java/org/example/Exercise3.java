package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/register");
        Thread.sleep(2500);

        WebElement gender = driver.findElement(By.id("gender-male"));
        gender.click();
        Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Test");
        Thread.sleep(1000);

        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Testsson");
        Thread.sleep(1000);


        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("Test@testooy.test");
        Thread.sleep(1000);


        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Test123");
        Thread.sleep(1000);


        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("Test123");

        driver.findElement(By.id("register-button")).click();

        Thread.sleep(2500);
        if (driver.findElement(By.className("result")).getText().contains("Your registration completed")){
            System.out.println("Account registrated!");
        }

    }
}
