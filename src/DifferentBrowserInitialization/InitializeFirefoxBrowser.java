package DifferentBrowserInitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitializeFirefoxBrowser {
    public static void main(String[] args) {
        String root=System.getProperty("user.dir");
        String geckoDriverPath=root+ "\\drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", geckoDriverPath);
        WebDriver driver = new FirefoxDriver(); //but here the driver point over the FireFoxDriver in the heap
        driver.get("http:www.facebook.com");  //so here the garbage collector destroy(from the memory allocation) the ChromeDriver object because is no longer pointed,no longer use it, to save memory
        driver.close();

    }
}
