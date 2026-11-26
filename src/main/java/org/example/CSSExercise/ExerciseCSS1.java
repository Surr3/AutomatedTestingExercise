/*
package org.example.CSSExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ExerciseCSS1 {
    static void main() {
       WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login?utm_source=chatgpt.com");

        WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));

        WebElement username = driver.findElement(By.cssSelector("#login #username"));
        WebElement password = driver.findElement(By.cssSelector("#login #password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));

        List<WebElement> allButtons = driver.findElements(By.cssSelector("#login button"));

        WebElement username = driver.findElement(By.cssSelector("#login input[type='text']"));
        WebElement username = driver.findElement(By.cssSelector("#login input[type='text'][name='username']"));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));

        WebElement loginButton = driver.findElement(By.cssSelector("#form button[class='radius'][type='submit']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[class='radius'][type='submit']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[class*='diu'][type='submit']"));

        WebElement loginButton = driver.findElement(By.cssSelector("input[type='text'][name^='user'][id*='name']"));

        WebElement input = driver.findElement(By.cssSelector("input[id$='name'][class~='required'][name='user']"));

        WebElement input = driver.findElement(By.cssSelector("#login #username"));

        List< WebElement> allInput = driver.findElements(By.cssSelector("#login input"));
        WebElement firstInput = driver.findElements(By.cssSelector("#login input")).getFirst();
        WebElement lastInput = driver.findElements(By.cssSelector("#login input")).getLast();

        WebElement loginButton = driver.findElement(By.cssSelector(".radius[type='submit']"));

        WebElement usernameField = driver.findElement(By.cssSelector("[id^='user']"));
        WebElement passwordField = driver.findElement(By.cssSelector("[id$='word']"));
        WebElement loginbutton = driver.findElement(By.cssSelector("#login input:nth-child(0)"));

        WebElement loginbutton = driver.findElement(By.cssSelector("#login div input:last-child"));

        WebElement loginbutton = driver.findElement(By.cssSelector("#login div:first-child div input:nth-child(2)"));

        WebElement loginbutton = driver.findElement(By.cssSelector("#login div:first-child div:nth-child(2) input:nth-child(2)"));

        WebElement loginbutton = driver.findElement(By.cssSelector("#login button:last-of-type"));

        List<WebElement> fruistList = driver.findElements(By.cssSelector("#fruits>li"));





    }
}
*/
