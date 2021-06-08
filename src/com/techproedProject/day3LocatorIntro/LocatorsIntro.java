package com.techproedProject.day3LocatorIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsIntro {


    /*
    user goes to http://a.testaddressbook.com/sign_in
    Locate the elements of email textbox, password textbox, and signin button
    Enter below username and password then click sign in button
    Username :  testtechproed@gmail.com
    Password : Test1234!
    Then verify that the expected user id testtechproed@gmail.com (USE getText() method to get the text from the page)
    Verify the Addresses and Sign Out texts are displayed
    Find the number of total link on the page
    Sign out from the page

     */

    public static void main(String[] args) throws InterruptedException {

        //setup
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // Driver Object

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // going to target page
        driver.get("http://a.testaddressbook.com/sign_in");// => your page or browser

// Locate the elements of email textbox, password textbox, and signin button


        WebElement emailInputBox = driver.findElement(By.id("session_email"));
        Thread.sleep(2000);
        emailInputBox.sendKeys("testtechproed@gmail.com");


        WebElement passwordInputBox = driver.findElement(By.id("session_password"));
        Thread.sleep(2000);
        passwordInputBox.sendKeys("Test1234!");


        WebElement submitButton = driver.findElement(By.name("commit"));
        Thread.sleep(2000); // static wait stop the execution
        submitButton.click();


        //Then verify that the expected user id testtechproed@gmail.com
        // (USE getText() method to get the text from the page

        WebElement userEmail= driver.findElement(By.className("navbar-text"));

        String expectedEmail="testtechproed@gmail.com";
        String actualEmail=userEmail.getText();

        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual email: "+actualEmail);
        }

        // Verify the Addresses and Sign Out texts are displayed

        WebElement addresses = driver.findElement(By.linkText("Addresses"));

        if(addresses.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAILL");
            System.out.println("Address element is not displayed");
        }

        WebElement singOut = driver.findElement(By.partialLinkText("Sign "));

        if(singOut.isDisplayed()){ // isDisplayed() return true or false
                                    // if selenium find this element it will return TRUE
                                        //if not it will return FALSE
            System.out.println("PASS");
        }else{
            System.out.println("FAILL");
            System.out.println("Address element is not displayed");
        }


        //Find the number of total link on the page

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println(allLinks.size()); // 3


        // Sign out from the page
        singOut.click();



        Thread.sleep(3000);
        driver.quit();
    }


    }
