package com.techproedProject.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

    public static void main(String[] arg){

        // setup
        // creating object
        // going to url

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\library\\Driver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");


        WebDriver driver=new FirefoxDriver();

        //FirefoxDriver drv=new FirefoxDriver();
        //drv.get("https://google.com");

        driver.get("https://google.com");

//     driver= new ChromeDriver();
//     drv=new ChromeDriver();

        driver.quit();

        // 15 minutes break come back at 25






    }

}
