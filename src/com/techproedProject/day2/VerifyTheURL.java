package com.techproedProject.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTheURL {

    // main method
    public static void main(String[] args) {

        //setup
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        // 3. STEP  Creating WebDriver object

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        // 2.Navigate to google homepage

        driver.get("https://www.google.com");

        // taking the current url from the source
        // Verify if google homepage url is “www.google.com”
        //driver.getCurrentUrl(); // this method gives us current url

        String expectedURL="www.google.com";
        String actualURL=driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAİLED");
            System.out.println("ActualURL: "+ actualURL);
            System.out.println("ExpectedURL: "+expectedURL);
        }

        driver.quit();



    }
}
