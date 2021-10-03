package HandlingDifferentWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");  //we are landing on the main page of the website

        driver.findElement(By.linkText("Sign in")).click();  //handle button and also you can use submit()

        WebElement email = driver.findElement(By.id("email_create"));
        email.sendKeys("mira@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(3000);

        WebElement firstName = driver.findElement(By.id("customer_firstname"));
        firstName.sendKeys("Mira");

        String firstNameText = firstName.getAttribute("value");  //we are getting the value that we insert before
        System.out.println(firstNameText);

        Thread.sleep(2000);
        firstName.clear();


    }
}
