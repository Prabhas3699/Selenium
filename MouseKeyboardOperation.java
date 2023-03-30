package com.bridgelabz.caq115selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class MouseKeyboardOperation {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        Robot r = new Robot();


        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_I);

        r.keyRelease(KeyEvent.VK_I);
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(3000);

        driver.close();
    }
}
