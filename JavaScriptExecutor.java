package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("C:\\Users\\prabh\\IdeaProjects\\CQA115Selenium\\src\\main\\resources\\Test.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);

        driver.findElement(By.id("username")).sendKeys("Prabha");
        Thread.sleep(3000);
        js.executeScript("document.getElementById('pass').value='password'");
        Thread.sleep(3000);

        driver.navigate().to("https://www.amazon.in/");

        for (int i = 1; i < 4; i++) {
            //scroll down on the webpage
            js.executeScript("window.scrollBy(0, 300)");
            Thread.sleep(3000);
        }

        for (int i = 1; i < 4; i++) {
            //scroll down on the webpage
            js.executeScript("window.scrollBy(0, -300)");
            Thread.sleep(3000);
        }
        Thread.sleep(3000);

        driver.close();
    }
}
