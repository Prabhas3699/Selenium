package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFrame {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("C:\\Users\\prabh\\IdeaProjects\\CQA115Selenium\\src\\main\\resources\\page3.html");

        driver.findElement(By.id("t3")).sendKeys("t3");
        Thread.sleep(3000);

        driver.switchTo().frame("f2");
        driver.findElement(By.id("t2")).sendKeys("t2");
        Thread.sleep(3000);

        driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("t1");
        Thread.sleep(3000);

        driver.switchTo().parentFrame();
        driver.findElement(By.id("t2")).clear();
        Thread.sleep(3000);

        driver.switchTo().defaultContent();
        driver.findElement(By.id("t3")).clear();
        Thread.sleep(3000);

        driver.close();
    }
}
