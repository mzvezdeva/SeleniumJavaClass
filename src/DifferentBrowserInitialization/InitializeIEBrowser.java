package DifferentBrowserInitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InitializeIEBrowser {
    public static void main(String[] args) {
        String root = System.getProperty("user.dir");
        String IEDriverPath = root + "\\drivers\\IEDriverServer.exe";
        System.setProperty("webdriver.ie.driver", IEDriverPath);
        //System.setProperty("webdriver.ie.driver","C:\\Users\\Zvezdevi\\SeleniumJavaClass\\drivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://www.facebook.com");
        driver.close();
    }
}
