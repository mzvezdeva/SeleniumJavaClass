package NavigationCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//all the buttons on top left for going back, forward or refresh the page we can do it with Selenium also
public class NavigationCommand {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https:www.google.com");
        Thread.sleep(3000);  //here we want to wait 3 sec until the next method and is exception this is why we throw it in the method as well
        driver.navigate().to("https://www.facebook.com");   //navigate to new page,different url

        Thread.sleep(3000);
        //navigate back to previous page
        driver.navigate().back();  //navigate one page back

        Thread.sleep(3000);
        //navigate forward one page
        driver.navigate().forward();

        Thread.sleep(3000);
        //refresh the current page
        driver.navigate().refresh();

        Thread.sleep(3000);
        driver.quit();
    }
}
