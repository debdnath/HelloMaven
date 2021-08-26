package com.graviton;


    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.Alert;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.openqa.selenium.support.ui.Select;

public class Delivery {
    public static void main(String [] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        driver.get("https://demo.broadleafcommerce.org/");


        WebElement myElement = driver.findElement(By.xpath("//a[@href='/login']"));
        myElement.click();

        System.out.println("print here1");

        WebElement myElement_email = driver.findElement(By.id("username"));
        myElement_email.clear();
        myElement_email.sendKeys("lincon_5@yahoo.com");
        System.out.println("print here2");

        WebElement myElement_password = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
        myElement_password.sendKeys("bangladesh123");

        WebElement myElement_rememberMe = driver.findElement(By.xpath("(//span[@class='checkbox-material'])"));
        myElement_rememberMe.click();

        WebElement myElement_login = driver.findElement(By.xpath("(//button[@class='btn btn-primary pull-right'])[1]"));
        myElement_login.click();
        Thread.sleep(3000);
        WebElement greenGhostAddCart = driver.findElement(By.xpath("//a[@href='/hot-sauces/green_ghost']/div"));
        greenGhostAddCart.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("(//div/button/span)[5]")).click();
        Thread.sleep(3000);
        System.out.println("print here3");
        driver.findElement(By.xpath("//a[@class='btn btn-primary goto-full-cart']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='/checkout']")).click();
        Thread.sleep(3000);

        String shipingText = driver.findElement(By.xpath("//*[@id='shippingInfo']/div/div[1]/h4/span")).getText();
        System.out.println("Shipping Text: " + shipingText);

        WebElement FullnameLink = driver.findElement(By.xpath("//input[@id='fullName']"));
        FullnameLink.click();
        FullnameLink.sendKeys("Deb");
        Thread.sleep(2000);

        WebElement AddressLink = driver.findElement(By.xpath("//input[@id='addressLine1']"));
        AddressLink.click();
        AddressLink.sendKeys("8809 148th Street");
        Thread.sleep(2000);

        WebElement Address2Link = driver.findElement(By.xpath("//input[@id='addressLine2']"));
        Address2Link.clear();
        Address2Link.sendKeys("Apt 505");
        Thread.sleep(2000);

        WebElement CityLink = driver.findElement(By.xpath("//input[@id='city']"));
        CityLink.clear();
        CityLink.sendKeys("Queens");
        Thread.sleep(2000);

        Select se = new Select(driver.findElement(By.xpath("//select[@id='stateProvinceRegion']")));
        se.selectByVisibleText("NY");
        Thread.sleep(2000);

        WebElement PostalCode = driver.findElement(By.xpath("//input[@id='postalCode']"));
        PostalCode.clear();
        PostalCode.sendKeys("11435");
        Thread.sleep(2000);

        WebElement PhoneLink = driver.findElement(By.xpath("//input[@id='phonePrimary']"));
        PhoneLink.clear();
        PhoneLink.sendKeys("1234567890");
        Thread.sleep(2000);

        WebElement radio1 = driver.findElement(By.xpath("//label[normalize-space()='Standard (5 - 7 Days)']"));
        radio1.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[normalize-space()='Continue']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='checkbox use-shipping-address-wrapper']//span[@class='check']")).click();
        Thread.sleep(2000);

        WebElement CardNumber = driver.findElement(By.xpath("//input[@id='cardNumber']"));
        CardNumber.clear();
        CardNumber.sendKeys("3794456412341234");
        Thread.sleep(2000);

        WebElement CVVLink = driver.findElement(By.xpath("//input[@id='securityCode']"));
        CVVLink.clear();
        CVVLink.sendKeys("768");
        Thread.sleep(2000);

        WebElement ExpLink = driver.findElement(By.xpath("//input[@id='cardExpDate']"));
        ExpLink.clear();
        ExpLink.sendKeys("07/25");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[normalize-space()='Continue']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='col-sm-4 checkout-stage-action']//a[@class='btn btn-primary pull-right js-performCheckout']")).click();
        Thread.sleep(2000);

        String ConfirmationText = driver.findElement(By.xpath("//span[normalize-space()='Order Confirmation #']")).getText();
        System.out.println("Order Confirmation # " + ConfirmationText);
        Thread.sleep(2000);


        driver.quit();



    }
}