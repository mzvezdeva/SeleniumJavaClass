package DifferentBrowserInitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InitializeEdgeBrowser {
    public static void main(String[] args) {

        String root = System.getProperty("user.dir");
        String edgePath = root + "\\drivers\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", edgePath);
        WebDriver driver = new EdgeDriver();
        driver.get("http:www.facebook.com");
        driver.close();
    }
}
