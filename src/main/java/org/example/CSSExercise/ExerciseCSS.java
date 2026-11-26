package org.example.CSSExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ExerciseCSS {
    static void main() {

       /* Find both checkboxes using findElements().



                Find the first checkbox using a CSS selector.



                Find the second checkbox using a CSS selector.



                Find all input elements inside the form with ID checkboxes.



                Find all elements with the type="checkbox" attribute.



                Find the form using its ID.*/
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes?utm_source=chatgpt.com");

        List<WebElement> allCheckboxes = driver.findElements(By.cssSelector("form[id='checkboxes']"));
        for (WebElement elements:allCheckboxes){
            System.out.println(elements.getText());
        }

        WebElement firstCheckbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        System.out.println(firstCheckbox.getAttribute("type"));
        WebElement secondCheckbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        System.out.println(secondCheckbox.getText());



    }
}
