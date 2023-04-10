package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.cssSelector("#email")).sendKeys("8109555221");
        Thread.sleep(2000);

        driver.findElement(By.id("pass")).sendKeys("Test12345");
        Thread.sleep(2000);

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(10000);
        System.out.println(driver.getTitle());

        driver.close();
    }
}