package Selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class TestListsAndWait {
    @Test
    public void testPrintLinkTexts(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        List<String> expected = List.of("Books","Computers","Electronics","Apparel & Shoes","Digital downloads","Jewelry","Gift Cards");

        List<WebElement> linkTexts = driver.findElements(By.cssSelector(".block-category-navigation .listbox a"));
        List<String> actual = new ArrayList<>();
        for (WebElement elements : linkTexts){
            actual.add(elements.getText());
        }

        assertEquals(expected,actual);

    }
}
