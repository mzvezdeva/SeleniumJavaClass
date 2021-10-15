package BrowserCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) {
        String pageUrl="http://automationpractice.com/index.php";
        String dir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", dir + "//drivers//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(pageUrl);

        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        int titleLength = pageTitle.length();
        System.out.println("Title length: " + titleLength);

        String currentUrl = driver.getCurrentUrl();
        if (!currentUrl.equalsIgnoreCase(pageUrl)) {
            System.out.println("You are on the wrong web site!");
        } else {
            System.out.println("Verification is done!");
        }

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        int pageSourceLength = pageSource.length();
        System.out.println("Page Source length: " + pageSourceLength);

        driver.quit();
    }
}
