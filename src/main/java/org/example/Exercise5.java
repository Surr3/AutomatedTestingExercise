package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise5 {
    static void main() throws InterruptedException {
       /* Navigera till inloggningssidan:*/
       /* https://demowebshop.tricentis.com/login*/

       /* Logga in med ett testkonto.*/

       /*         Verifiera att du är inloggad*/

       /* Logga ut och verifiera att du är utloggad*/

        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/login");
        Thread.sleep(250);

        driver.findElement(By.id("Email")).sendKeys("fasd@fasd.com");
        Thread.sleep(250);
        driver.findElement(By.id("Password")).sendKeys("123123");
        Thread.sleep(250);

        WebElement loginButton = driver.findElement(By.className("login-button"));
        loginButton.click();
        Thread.sleep(250);
        if (driver.findElement(By.className("account")).getText().equalsIgnoreCase("fasd@fasd.com")){
            System.out.println("Log in successful!");
        }
        Thread.sleep(2500);
        driver.quit();

    }
}
