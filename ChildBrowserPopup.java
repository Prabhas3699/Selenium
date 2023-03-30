package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class ChildBrowserPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.naukri.com/");
        Thread.sleep(3000);

        String parentHandleid=driver.getWindowHandle();
        System.out.println("Current window handle id : "+parentHandleid);

        driver.findElement(By.xpath("//span[contains(text(),'Remote')]")).click();
        Thread.sleep(2000);

        Set<String> WindowHandle=driver.getWindowHandles();

        for (String windowHandleid:WindowHandle){
            System.out.println("Window Handle id : "+windowHandleid);

            if (!windowHandleid.equals(parentHandleid)){
                driver.switchTo().window(windowHandleid);
            }
        }
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//div[@class='info fleft'])[1]")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
