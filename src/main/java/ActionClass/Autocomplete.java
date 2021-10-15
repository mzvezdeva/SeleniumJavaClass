package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/auto-complete");
        //Sendkey to input box
        driver.findElement(By.id("autoCompleteMultipleInput")).sendKeys("bl"); //you should search for input tag !!!! to make your path working
        //Initialize Actions class
        Actions builder = new Actions(driver);
        //The press down key- when you type bl you press down arrow to choose one of the selections
        builder.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();//press the down arrow 2 times and choose the second one by enter
        //if you want to slow it down and see what exactly is executing
      /*  builder.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        builder.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        builder.sendKeys(Keys.ENTER).perform(); */
      /*  builder.moveToElement(driver.findElement(By.xpath("//*[@id='myInputautocomplete-list]//div[3]"))) //better version
                  .click()
                  .build()
                  .perform();  */  //locate the choice that you want and find the xpath directly and click on it because may be after 1 month there will be new option,and you cannot control it with the arrow for 100%


    }
}
