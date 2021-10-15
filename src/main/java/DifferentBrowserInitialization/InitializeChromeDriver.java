package DifferentBrowserInitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeChromeDriver {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zvezdevi\\SeleniumJavaClass\\drivers\\chromedriver.exe");  //set a path for the ChromeDriver, but is going to be longer and longer
        //to keep it clear you can do it different way
        String root = System.getProperty("user.dir");
        String chromeDriverPath = root + "\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();  //we are simply using the driver variable and this driver is pointing on ChromeDriver in the heap(you remember heap and stack)
        driver.get("http:www.facebook.com");  //and here driver is using the new ChromeDriver Object to get the website
        //Close the browser
        driver.close();
    }
}
