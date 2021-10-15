package HandlingHTMLTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HTMLTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");

        List<WebElement> tableElemList = driver.findElements(By.xpath("//*[@class='table-responsive']//tbody//tr[4]//td"));
        for(WebElement tableElem: tableElemList){
            System.out.println(tableElem.getText());
        }
    }
}
