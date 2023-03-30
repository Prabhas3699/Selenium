package com.bridgelabz.caq115selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class ChildWindowPopup {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");

        Thread.sleep(2000);

        String parentWindowHandleId = driver.getWindowHandle();
        System.out.println("parent window handle id: " + parentWindowHandleId);
        System.out.println("Paranet window Ttile: " + driver.getTitle());

        driver.findElement(By.xpath("//span[contains(text(),'Remote')]")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        String firstChildWindow = null;
        for (String windowHandle : windowHandles) {
            System.out.println("window handle Id: " + windowHandle);

            if (!windowHandle.equals(parentWindowHandleId)) {
                firstChildWindow = windowHandle;
                driver.switchTo().window(windowHandle);
                Thread.sleep(8000);
                driver.findElement(By.xpath("//a[contains(text(),'Product Intern')]")).click();
                Thread.sleep(4000);
                // driver.close();
            }
        }
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String allWindowHandle : allWindowHandles) {

            System.out.println("All window handle ID: " + allWindowHandle);

            /* to close all window accept parent window */
            if (!allWindowHandle.equals(parentWindowHandleId)) {
                if (allWindowHandle.equals(firstChildWindow)) {
                    driver.switchTo().window(firstChildWindow);
                    driver.close();
                } else if (!allWindowHandle.equals(firstChildWindow)) {
                    driver.switchTo().window(allWindowHandle);
                    Thread.sleep(2000);
                    driver.close();
                }
            }
            /* to close parent window */
            else if (allWindowHandle.equals(parentWindowHandleId)) {
                driver.switchTo().window(parentWindowHandleId);
                //  driver.close();
            }
        }

        Thread.sleep(4000);
        //driver.close();
        //driver.quit();
    }
}
