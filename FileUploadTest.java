package com.bridgelabz.caq115selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class FileUploadTest {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ilovepdf.com/excel_to_pdf");

        driver.findElement(By.xpath("//span[contains(text(),'Select EXCEL files')]")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\prabh\\OneDrive\\Documents\\FileUpload.exe");

    }
}
