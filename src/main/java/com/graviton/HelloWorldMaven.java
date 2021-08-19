package com.graviton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorldMaven {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");

        System.setProperty("webdriver.gecko.driver","/Users/joyswarna/Desktop/Driver/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.apache.org/");

        Thread.sleep(5000);

        System.out.println("Hello Selenium");

        driver.quit();
    }
}
