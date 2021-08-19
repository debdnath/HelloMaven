package com.graviton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AugustEighteen {

    public static void main(String [] args) throws InterruptedException {
        System.out.println("Welcome to demo.broadleafcommerce.org");

        System.setProperty("webdriver.gecko.driver","/Users/joyswarna/Desktop/Driver/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.broadleafcommerce.org");

        WebElement myElement = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        Thread.sleep(2000);

        myElement.click();
        Thread.sleep(2000);

        WebElement registrationLink = driver.findElement(By.xpath("//input[@id='customer.emailAddress']"));
        registrationLink.click();
        registrationLink.sendKeys("debdnath007@gmail.com");
        Thread.sleep(2000);

        WebElement firstnameLink = driver.findElement(By.xpath("//input[@id='customer.firstName']"));
        firstnameLink.sendKeys("Deb");
        Thread.sleep(2000);

        WebElement lastnameLink = driver.findElement(By.xpath("//input[@id='customer.lastName']"));
        lastnameLink.sendKeys("Nath");
        Thread.sleep(2000);

        WebElement passwordLink = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[4]/div[2]/input[1]"));
        passwordLink.sendKeys("mango@banana123");
        Thread.sleep(2000);

        WebElement confirmpasswordLink = driver.findElement(By.xpath("//input[@id='passwordConfirm']"));
        confirmpasswordLink.sendKeys("mango@banana123");
        Thread.sleep(2000);

        WebElement registerButton = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
        registerButton.click();
        Thread.sleep(3000);


        driver.quit();
    }
}
