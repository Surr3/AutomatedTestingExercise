package org.example.ListExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ExerciseLists {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> allList = driver.findElements(By.cssSelector("li"));
        for (WebElement listObject:allList){
            System.out.println(listObject.getText());
        }
        System.out.println(allList.size());

        Thread.sleep(1500);
        driver.quit();
    }
}
