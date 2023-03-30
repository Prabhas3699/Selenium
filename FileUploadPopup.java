package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();

        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");

        driver.findElement(By.xpath("(//input[@type='file'])[2]")).sendKeys("D:\\chromedriver_win32\\File.txt");
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
        Thread.sleep(3000);

        driver.close();
    }
}
