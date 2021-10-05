package HandlingDifferentWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class HandlingFileUpload {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        WebElement fileUploadElem = driver.findElement(By.id("photo"));  //locate the button where we need to upload the picture
        fileUploadElem.sendKeys(projectPath +"//images//Tsarevets-Fortress-Veliko-Tarnovo-Bulgaria_CS-452d6dd9957b.jpg"); //locate the image and upload it



    }
}
