package HandlingDifferentWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        driver.findElement(By.id("email_create")).sendKeys("mira@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);

        WebElement date = driver.findElement(By.xpath("//select[@name='days']"));
        Select dateDropDown = new Select(date);   //we use Select Class for dropdown and that class should pass the path of the dropdown menu
        //dateDropDown.selectByIndex(10);   //will select 10th date
        List<WebElement> dates = dateDropDown.getOptions();   //will return all the options in a list
        System.out.println(dates.size());   //will return you the size of the list
        for (WebElement dateSelect : dates) {
            System.out.println(dateSelect.getText());
        }
        Thread.sleep(3000);
        WebElement states = driver.findElement(By.id("uniform-id_state"));
        states.click();
        List<WebElement> optionStates = driver.findElements(By.xpath("//select[@id='id_state']//option"));
        Thread.sleep(2000);
        for (WebElement option : optionStates) {
            if (option.isEnabled() && option.getText().equalsIgnoreCase("Illinois")) {
                option.click();
                break;
            }
        }
        states.click();
    }
}
