package MyFirstSeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumTest {

    public static void main(String[] args) {

        String dir = System.getProperty("user.dir");  //value of the directory that you are currently in,this will return the path for that project
        System.out.println(dir);

        System.setProperty("webdriver.chrome.driver", dir + "//drivers//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");

        String pageTitle = driver.getTitle();

        if (!pageTitle.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
            System.out.println("You are at the wrong page!");
            driver.close();
        } else {
            System.out.println("Page title: " + pageTitle);
            driver.close();
        }

    }
}
