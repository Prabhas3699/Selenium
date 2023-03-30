package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAction {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        WebElement prime = driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));

        Actions action = new Actions(driver);
        action.moveToElement(prime).perform();

        Thread.sleep(3000);

        driver.quit();

    }
}
