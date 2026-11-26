package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;
import java.util.NoSuchElementException;

public class ExerciseCheckboxes {
    static void main() throws InterruptedException {
/*
        Open https://the-internet.herokuapp.com/checkboxes.



        Select the first checkbox.



        Deselect the second checkbox.



        Verify both checkbox states.*/

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(500);
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("form[id='checkboxes']"));
        Thread.sleep(500);
        System.out.println(checkboxes.get(0));
        System.out.println(checkboxes.get(1));

       /* checkboxes.get(0).click();
        Thread.sleep(500);
        checkboxes.get(1).click();
        Thread.sleep(500);*/

        if (checkboxes.getFirst().isSelected() && !checkboxes.getLast().isSelected()){
            System.out.println("First checkbox is selected and Second checkbox is not selected.");
        }

    }
}
