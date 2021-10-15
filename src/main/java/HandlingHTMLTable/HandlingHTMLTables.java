package HandlingHTMLTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingHTMLTables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.fda.gov/food/new-nutrition-facts-label/how-understand-and-use-nutrition-facts-label");
        List<WebElement> headerElemList = driver.findElements(By.xpath("//table[@summary='display']//th"));
        //write a script to check if any data exist
        /*boolean isExist = false;
        for (WebElement headerElement : headerElemList) {
            if (headerElement.getText().equalsIgnoreCase("Example")) {
                isExist = true;
                break;
            }
        }
        if(isExist){
            System.out.println("Example is exist");
        }else{
            System.out.println("Example does not exist in the column");
        }*/
        //print all the columns
        for (WebElement headerElem : headerElemList) {
            System.out.println(headerElem.getText());
        }
        //to get the data from the 3rd row, and all the data is in td section
        List<WebElement> tableDataElemList = driver.findElements(By.xpath("(//table[@summary='display']//tr)[3]/td"));
        for (WebElement tableDataElm : tableDataElemList) {
            System.out.println(tableDataElm.getText());
        }
    }
}
