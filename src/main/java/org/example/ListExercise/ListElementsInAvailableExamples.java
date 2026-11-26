package org.example.ListExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListElementsInAvailableExamples {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //Finds all li-elements that are descendant to #content, a div
        List<WebElement> specificListElements = driver.findElements(By.cssSelector("#content li"));
        for (WebElement listTest : specificListElements){
            System.out.println(listTest.getText());
        }

        //Finds all list elements that are DIRECT children to #content div.
        List<WebElement> directChildListElements = driver.findElements(By.cssSelector("#content>li"));
        for (WebElement directChildren : directChildListElements ){
            System.out.println(directChildren.getText());
        }
        //Prints all li elements that are descendant to #content --> 76
        System.out.println(specificListElements.size());

        //Prints all li elements that are direct children to #content --> 0, since there are no direct children element to #content that are li-elements. HTML structure is #conten>ul>li, li-elements are direct children to an ul-element not #content
        System.out.println(directChildListElements.size());
        driver.quit();
    }
}
