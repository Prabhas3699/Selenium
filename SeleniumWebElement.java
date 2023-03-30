package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement email= driver.findElement(By.cssSelector("#email"));
        email.sendKeys("8109555221");
        Thread.sleep(2000);

        WebElement pass =driver.findElement(By.id("pass"));
        pass.sendKeys("Test12345");
        Thread.sleep(2000);

        WebElement login =driver.findElement(By.tagName("button"));
        login.click();
        Thread.sleep(2000);
    }
}
