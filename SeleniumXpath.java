package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://app.hubspot.com/login");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("prabha");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("12345");
        Thread.sleep(3000);

        driver.navigate().to("https://www.facebook.com/");

        driver.findElement(By.xpath("//input[@id='email' and @type='text']")).sendKeys("8109555221");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[contains(@id,'pass') and @type='password']")).sendKeys("Test12345");
        Thread.sleep(3000);

//        driver.findElement(By.xpath("//button[text()='Log in']")).click();
//        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
        Thread.sleep(2000);

        driver.close();
    }
}
