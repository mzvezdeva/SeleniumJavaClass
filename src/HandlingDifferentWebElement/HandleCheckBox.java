package HandlingDifferentWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        driver.findElement(By.id("email_create")).sendKeys("mira@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);
        /* //one way to select them one by one
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='optin']")).click();*/

        List<WebElement> checkBoxElements = driver.findElements(By.xpath("//input[@type='checkbox']"));
       /* for (int i = 0; i < checkBoxElements.size(); i++) {
            System.out.println(checkBoxElements.get(i).getAttribute("id"));
            if (checkBoxElements.get(i).getAttribute("id").equalsIgnoreCase("newsletter")) {
                checkBoxElements.get(i).click();
            }
        }*/
        for (WebElement checkBox : checkBoxElements) {
            if (checkBox.getAttribute("id").equalsIgnoreCase("newsletter") && !checkBox.isSelected()) {
                checkBox.click();
            }
        }
    }
}
