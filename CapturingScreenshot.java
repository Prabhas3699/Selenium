package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CapturingScreenshot {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.name("email")).sendKeys("8109555221");
        Thread.sleep(2000);

        /*
        typecasting
         */
        TakesScreenshot ts = (TakesScreenshot) driver;

        /*
         * getting source file
         */
        File sf = ts.getScreenshotAs(OutputType.FILE);

        /*
         * destination of source file
         */
        File df = new File(".//Screenshot//"+System.currentTimeMillis() + "_screenshot.png");

        /*
         * to store source file in destination
         */
        try {
            FileHandler.copy(sf, df);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Thread.sleep(4000);

        driver.close();
    }
}
