package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumCSS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://app.hubspot.com/login");

        driver.findElement(By.cssSelector("#username")).sendKeys("prabha");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector(".form-control.private-form__control.login-password.m-bottom-3")).sendKeys("12345");
        Thread.sleep(3000);

        driver.navigate().to("https://www.facebook.com/");

//        driver.findElement(By.cssSelector("input[id*='emai']")).sendKeys("8109555221");
//        Thread.sleep(3000);
//
//        driver.findElement(By.cssSelector("input[id^='pa']")).sendKeys("Test12345");
//        Thread.sleep(3000);
//
//        driver.findElement(By.cssSelector("button[type$='mit']")).click();
//        Thread.sleep(3000);

        driver.findElement(By.cssSelector("a[data-testid*='open-registration-form']")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Prabha");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("karan");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("9677513412");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("Prabha123@");
        Thread.sleep(2000);

        Select day = new Select(driver.findElement(By.cssSelector("span>select:first-of-type")));
        day.selectByIndex(2);
        Thread.sleep(1000);

        Select month= new Select(driver.findElement(By.cssSelector("span>select:nth-of-type(2)")));
        month.selectByVisibleText("Jun");
        Thread.sleep(1000);

        Select year = new Select(driver.findElement(By.cssSelector("span>select:last-of-type")));
        year.selectByValue("1999");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("span>label[class='_58mt']+input[value='2']")).click();
        Thread.sleep(2000);

        driver.close();
    }
}
