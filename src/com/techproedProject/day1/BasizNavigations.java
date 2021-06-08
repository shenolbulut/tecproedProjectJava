package com.techproedProject.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasizNavigations {

    public static void main(String[] args) {

        // setup

        System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\library\\Driver\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        // maximize the window

        driver.manage().window().maximize();

        // newt step is always going your url

        //driver.get("https://www.google.com");

        driver.navigate().to("https://www.google.com");


        //What are the differences between get() and navigate().to()

        // 1. get() is shorter and easy to write and more common
        // 2. get() is little faster
        // 3. navigate() has more choise, back(), forward(), refresh()
        // 4. get("ACCEPT STRING") but navigate().to("URL URL")

        // navigate back
        driver.navigate().back();

        // navigate forvard
        driver.navigate().forward();

        //navigate refresh
        driver.navigate().refresh();

        // for closeing there two methods
        // 1 is driver.close()
        //2 is driver.quit()

        //driver.close();

        driver.quit();

        // what is difference
        // close VS quit
        // close() => the CURRENT browser

        // quit() => close ALL working browser. this is stronger then close()

        // HOWEWORK
         // CREATE A PROJECT
            // CREATE PACKAGES LİKE THİS DRİCTORY
            // NAVİGATE TO AMAZON.COM
            // USE navigate() options
            // use quit() method bu yourself
            // rename your project
            // delete your project






    }

}
