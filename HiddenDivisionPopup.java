package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivisionPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        option.addArguments("--disable-geolocation");
        option.addArguments("--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
        Thread.sleep(3000);

        driver.close();
    }
}
