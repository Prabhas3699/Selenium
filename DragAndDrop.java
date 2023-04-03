package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        Wait wait1=new FluentWait(driver).withTimeout(Duration.ofSeconds(20))
                        .pollingEvery(Duration.ofSeconds(2))
                        .ignoring(Exception.class);
        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");

        //write xpath for Block 1
        String xp1 = "//h1[.='Block 1']";
        WebElement block1 = (WebElement) wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xp1))));
        //write xpath for Block 3
        String xp2 = "//h1[.='Block 3']";
        WebElement block3 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xp2))));
        //Create an object of Actions class and pass driver object as an argument
        Actions actions = new Actions(driver);

        // drag block 1 element and drop it on block 2 element
        actions.dragAndDrop(block1, block3).perform();

        //call the dragAndDropBy() method of Actions class
//        actions.dragAndDropBy(block1, block3.getLocation().getX()+10,
//                block3.getSize().getHeight()+10).perform();
    }
}
