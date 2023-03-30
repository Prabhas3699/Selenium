package com.bridgelabz.caq115selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumAlertPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
        Thread.sleep(4000);

        //Switch to alert pop up
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);

        System.out.println(alert.getText());
        Thread.sleep(2000);

        alert.sendKeys("prabha");
        Thread.sleep(3000);

        //click on OK button
        alert.accept();
        Thread.sleep(2000);

//        //click on Cancel button
//        alert.dismiss();
//        Thread.sleep(200);

        System.out.println(alert.getText());
        Thread.sleep(2000);

        alert.accept();
        Thread.sleep(2000);

        driver.close();
    }
}
