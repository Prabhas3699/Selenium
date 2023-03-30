package com.bridgelabz.caq115selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;

public class FileDownloadPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        //Create Hashmap object and assign the profile settings
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", "D:\\");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("prefs", chromePrefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("http://www.seleniumhq.org/download/");
        Thread.sleep(3000);

        driver.findElement(By.linkText("4.8.1")).click();
        Thread.sleep(2000);

        driver.close();
    }
}
