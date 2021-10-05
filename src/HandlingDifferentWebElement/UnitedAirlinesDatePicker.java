package HandlingDifferentWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UnitedAirlinesDatePicker {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.united.com/en/us");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement departElement = driver.findElement(By.id("DepartDate"));
        String defaultDate = departElement.getAttribute("value");//before we click it we want to take the text from it and verify later
        //make sure you put space between the " " because if you do not will split it every letter separately
        String[] dateAndMonth = defaultDate.split(" ");//we should split the month and date from the year//this method will split the String,remove the space and return String[]={"month", "date","year"}
        String defaultMonth = dateAndMonth[0];
        //but we cannot compare Strings, so we should convert it to integers to compare them and will write a method that is going to return numeric(int)
        int numDefaultMonth = getIntMonth(defaultMonth);  //will return me the default month but integer
        String travelMonth = "Oct";  //when we want to travel
        int numTravelMonth = getIntMonth(travelMonth);
        departElement.click();  //we click on the date the calendar to open
        WebDriverWait wait = new WebDriverWait(driver, 15);  //wait for it to show up
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class,'DayPicker_transitionContainer')]")));
        WebElement leftButton = driver.findElement(By.xpath("//button[contains(@class,'prevIconContainer')]"));
        WebElement rightButton = driver.findElement(By.xpath("//button[contains(@class,'nextIconContainer')]"));

        if (numTravelMonth < numDefaultMonth) {   //we should click the arrow for back
            while(true) {
                WebElement leftTableTitle= driver.findElement(By.xpath("(//*[contains(@class,'DayPicker_transitionContainer')]//*[contains(@class,'CalendarMonth_caption_1')]/strong)[1]"));
                String leftTableTitleString=leftTableTitle.getText(); //I`m getting the text from here October 2021 for example
                if(leftTableTitleString.contains(travelMonth)){
                    break;
                }
                leftButton.click(); //we should click it until we find what we need, to verify
            }
        } else {  //if it`s greater we should click next
            while(true) {
                WebElement rightTableTitle= driver.findElement(By.xpath("(//*[contains(@class,'DayPicker_transitionContainer')]//*[contains(@class,'CalendarMonth_caption_1')]/strong)[3]"));
                String rightTableTitleString=rightTableTitle.getText(); //I`m getting the text from here October 2021 for example
                if(rightTableTitleString.contains(travelMonth)){
                    break;
                }
                rightButton.click(); //we should click it until we find what we need, to verify
            }

        }
    }

    public static int getIntMonth(String month) {
        int numericMonth = 0;
        switch (month) {
            case "Jan":
                numericMonth = 1;
                break;
            case "Feb":
                numericMonth = 2;
                break;
            case "Oct":
                numericMonth = 10;
                break;
            case "Nov":
                numericMonth = 11;
                break;
            case "Dec":
                numericMonth = 12;
                break;
            default:
                System.out.println("Not existing");
        }
        return numericMonth;
    }
}
