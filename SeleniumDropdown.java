package com.bridgelabz.caq115selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropdown {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Prabha");
        Thread.sleep(2000);

        driver.findElement(By.name("lastname")).sendKeys("karan");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_email__")).sendKeys("9677513412");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_passwd__")).sendKeys("Prabha123@");
        Thread.sleep(2000);

        //Dropdown
        Select day = new Select(driver.findElement(By.name("birthday_day")));
        day.selectByIndex(2);
        Thread.sleep(1000);

        Select month= new Select(driver.findElement(By.name("birthday_month")));
        month.selectByVisibleText("Jun");
        Thread.sleep(1000);

        Select year = new Select(driver.findElement(By.name("birthday_year")));
        year.selectByValue("1999");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        Thread.sleep(2000);

        driver.close();
    }
}

