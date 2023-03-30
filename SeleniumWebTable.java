package com.bridgelabz.caq115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class SeleniumWebTable {
        public static void main(String[] args) {
                System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                WebDriver driver =  new ChromeDriver(options);
                driver.manage().window().maximize();

                driver.get("C:\\Users\\prabh\\IdeaProjects\\CQA115Selenium\\src\\main\\resources\\Table.html");

                List<WebElement> thirdColumn=driver.findElements(By.xpath("//td[3]"));
                int cell=thirdColumn.size();
                System.out.println("third column"+cell);

                int sum=0;
                for (WebElement thirdCell : thirdColumn){
                        String cellvalue=thirdCell.getText();
                        int number=Integer.parseInt(cellvalue);
                        if(number<200){
                        System.out.println("  "+number);
                        sum=sum+number;
                        }else{
                                System.out.println("Total :"+number);
                        }
                }
                System.out.println("sum :"+sum);
        }
}
