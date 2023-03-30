package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CalenderPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.americanairlines.in/");

        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[.='8'])[1]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[.='15'])[1]")).click();
        Thread.sleep(3000);

        driver.close();
    }
}
