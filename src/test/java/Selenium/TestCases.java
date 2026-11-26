package Selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCases {
    @Test
    public void validLoginDataShouldLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(500);
        boolean expected = true;

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(500);
        String productText = driver.findElement(By.cssSelector("span.title")).getText();
        int productAmount = driver.findElements(By.cssSelector("#inventory_container .inventory_item")).size();

        System.out.println(productText);
        System.out.println(productAmount);

        boolean actual = productText.equals("Products") && productAmount == 6;

        assertEquals(expected, actual);

        Thread.sleep(500);
        driver.quit();
    }

    @Test
    public void invalidLoginDataShowsErrormessage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        String expected = "Epic sadface: Sorry, this user has been locked out.";
        Thread.sleep(500);

        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(500);

        String actual = driver.findElement(By.tagName("h3")).getText();
        System.out.println(actual);

        assertEquals(expected, actual);

        Thread.sleep(500);
        driver.quit();

    }

    @Test
    public void addingProductAddsProductToCart() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(500);
        boolean expected = true;

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(500);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();


        String productAmount = driver.findElement(By.cssSelector("span.shopping_cart_badge")).getText();
        String productPrice = driver.findElement(By.className("inventory_item_price")).getText();

        System.out.println(productPrice);
        System.out.println(productAmount);

        boolean actual = productPrice.equals("$29.99") && productAmount.equals("1");

        assertEquals(expected, actual);

        Thread.sleep(500);
        driver.quit();
    }

    @Test
    public void removingProductRemovesProductFromCart() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(500);
        String expected = "Cart, empty";

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(500);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
        Thread.sleep(500);

        driver.findElement(By.cssSelector("button.btn")).click();
        String actual = driver.findElement(By.cssSelector("a.shopping_cart_link")).getAttribute("aria-label");
        System.out.println(driver.findElement(By.cssSelector("a.shopping_cart_link")).getAttribute("aria-label"));

        assertEquals(expected, actual);

        Thread.sleep(500);
        driver.quit();
    }

    @Test
    public void testDropDown() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        String expected = "Option 1";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#dropdown"))));

        dropdown.click();

        driver.findElement(By.cssSelector("option[value='1']")).click();
        String actual = driver.findElement(By.cssSelector("option[selected='selected']")).getText();
        assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void testDropDown2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        String expected = "Option 1";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#dropdown"))));

        dropdown.click();

        driver.findElement(By.cssSelector("option:nth-of-type(2)")).click();
        String actual = driver.findElement(By.cssSelector("option[selected*='lect']")).getText();
        assertEquals(expected, actual);
        driver.quit();
    }

    @Test
    public void invisibleElement() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        boolean expected = true;

        driver.findElement(By.cssSelector("button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement header4 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#finish h4"))));
        boolean actual = header4.getText().equals("Hello World!") && driver.findElement(By.cssSelector("#finish")).getAttribute("style").isEmpty();
        System.out.println(expected);
        System.out.println(actual);

        assertEquals(expected, actual);
    }

    @Test
    public void abscentElement() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        String expected = "Hello World!";

        driver.findElement(By.cssSelector("button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement header4 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#finish h4")));

        String actual = header4.getText();
        System.out.println(expected);
        System.out.println(actual);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetTables() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        boolean expected = true;
        double maxDue = 0;
        int maxDueIndex = 0;

        List<WebElement> allEntries = driver.findElements(By.cssSelector("#table1 tbody tr"));
        List<String[]> entrySplitData = new ArrayList<>();

        for (WebElement entry : driver.findElements(By.cssSelector("#table1 tbody tr"))) {
            entrySplitData.add(entry.getText().split(" "));
        }
        for (int i = 0; i < entrySplitData.size(); i++) {

            if (maxDue < Double.parseDouble(entrySplitData.get(i)[3].replace("$", ""))) {
                maxDue = Double.parseDouble(entrySplitData.get(i)[3].replace("$", ""));
                maxDueIndex = i;
            }
        }

        boolean actual = allEntries.size() == 4 && (entrySplitData.get(maxDueIndex)[0] + " " + entrySplitData.get(maxDueIndex)[1] + " " + entrySplitData.get(maxDueIndex)[3]).equals("Doe Jason $100.00");
        System.out.println(entrySplitData.get(maxDueIndex)[0] + " " + entrySplitData.get(maxDueIndex)[1] + " " + entrySplitData.get(maxDueIndex)[3]);

        assertEquals(expected, actual);
    }
    
}