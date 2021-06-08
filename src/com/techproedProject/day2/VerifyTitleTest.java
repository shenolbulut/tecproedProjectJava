package com.techproedProject.day2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {

    // main method
    public static void main(String[] args) throws InterruptedException {

        //setup
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        // 3. STEP  Creating WebDriver object

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(1000);

        // 2.Navigate to google homepage

        driver.get("https://www.google.com");

        //  3.Verify(expected vs actual) if google title is “google”

        String expectedTitle="google"; //Google
        String actualTitle= driver.getTitle(); // getTitle()=> is directly giving the title of the page

        //never manupulate this actual object

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");

        }else{
            System.out.println("FAILED");
            System.out.println("ACTUAL: "+ actualTitle);
            System.out.println("Expected: "+ expectedTitle);
        }

        // This test failed maybe we found a bug

        // what do we need to do right know

        //1. Look again the user story and acceptence criteria

        //2. Run your test case again also reproduce your bug with manuel

        //3. Communication is start ( BA, or DEV or PO )

        //4. Creating a bug report it depends the company culture and it depends the isCritical

        //########
        // after your bug fixed

        //1 you need to test again or retest or reproduce
        // If pass, close the ticket
        // if fail again comunication




    }
}
