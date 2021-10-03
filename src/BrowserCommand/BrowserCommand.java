package BrowserCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand {

    static WebDriver driver; //when we are building framework we will do one reference variable to reuse it, so we will make it static but make sure you always initialize it before you want to use it

    public static void main(String[] args) {
        String dir = System.getProperty("user.dir"); //we are doing it on that way in case someone downloads our project and work on it and our paths will be different but on that way is going to work for everyone
        System.setProperty("webdriver.chrome.driver", dir + "//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        //Navigate to facebook.com
        driver.get("https://www.facebook.com");
        //getting title of the web page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        //get the current url of the page where the driver is at to verify is it the current url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        //get page source will return the whole page source code
        String pageSource = driver.getPageSource();
        System.out.println("Page source: " + pageSource);
        //close the browser of the current session
        driver.close();
        //this will close all the browsers open by the driver, it`s like terminating command to terminate the object and is better to use quit instead of close, just in case
        //for example when you are testing and in the session of testing you click on a path that open another page but actually is using the same driver, so with quit you will close all of them
        driver.quit();
    }
}
