package com.techproedProject.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSeleniumClass {


// This is our first JAVA Automation class

    // 1. Step= Create a main method to execute our scripts
    // main -> hit enter this gives you main method
    public static void main(String[] args) {

        //2. System.setProperty("DRİVER TYPE","DRİVER-PATH") FİRST İS WHAT SECOND İS WHERE
        // DRİVER TYPE=webdriver.chrome.driver,
        //WHERE IS IT FOR MAC USER=/Users/techproed/Documents/selenium dependencies/drivers/chromedriver
        //WHRE İS IT FOR WİNDOWS USER="C:\Users\SAMSUNG\Desktop\library\Driver\chromedriver.exe"
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\library\\Driver\\chromedriver.exe");

        // 3. STEP  Creating WebDriver object

        WebDriver driver=new ChromeDriver();

        // we have to import Selenium Jar files to our Framework

        // STEP 1,2 AND 3  are mandotory for java Automation framework
        //NOTE: when we learn maven, we will not follow this steps

        // 4. Now that we are done with setup and we can wirte automation script
        // going to google

        driver.get("https://www.google.com");
    }



}
