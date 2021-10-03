package HandlingDifferentWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class HandleRadioButton {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        driver.findElement(By.id("email_create")).sendKeys("mira@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);
      /*  WebElement mrsRadio = driver.findElement(By.id("id_gender2"));
        System.out.println("Before we selected: " + mrsRadio.isSelected());
        if (!mrsRadio.isSelected()) {   //if is not selected click on it because if it`s selected this is what I want
            mrsRadio.click();
        }
        System.out.println("After we selected: " + mrsRadio.isSelected());*/
        clickRadio(driver, By.xpath("//div[@class='radio-inline']"), "Mrs.");
        Thread.sleep(2000);

        driver.quit();
    }
    public static void clickRadio(WebDriver driver, By locator, String genderTitle) {  //on that way you can reuse the method for different option of the gender as well
        //better way to handle radio buttons, locate all the radio buttons in the group and loop them and choose which ever you need
        List<WebElement> titleEle = driver.findElements(locator);
        //loop through each of the elements and check if the text is what we want to select, if yes we click on it
        for (WebElement title : titleEle) {   //every element from the group of elements "title", title contain all 2 of them
            System.out.println(title.getText());   //getting the text for all genders
            if (title.getText().trim().equalsIgnoreCase(genderTitle)) {  //trim() help us to take out all the spaces if there are any
                title.click();
                break;    // as soon as click to break it, because we want to click one time and move on
            }
        }
    }
}
