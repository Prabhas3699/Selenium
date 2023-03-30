package com.bridgelabz.caq115selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class SeleniumFindElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =  new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("total number of links present on the web page is : "+allLinks.size());

        int visibleLinkCount = 0;
        int hiddenLinkCount = 0;

        for (WebElement link : allLinks) {
            if (link.isDisplayed()) {
                visibleLinkCount++;
                System.out.println(visibleLinkCount+" --> "+link.getText());
            }else{
                hiddenLinkCount++;
                System.out.println(hiddenLinkCount+"--> /hidden/");
            }
        }
        System.out.println("Total number of visible links :" + visibleLinkCount);
        System.out.println("Total number of hidden links :" + hiddenLinkCount);
        driver.close();
    }
}
