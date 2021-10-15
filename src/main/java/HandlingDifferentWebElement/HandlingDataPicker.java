package HandlingDifferentWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingDataPicker {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.skyscanner.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("depart-fsc-datepicker-button")).click();  //we click on the calendar to open up
        //will you wait method the table to be open, dynamically wait the item to be available
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement datePicker = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("depart-fsc-datepicker-popover"))); //datePicker is the whole calendar and contain the button next, so I`ll use the variable
        WebElement next = datePicker.findElement(By.id("depart-calendar__bpk_calendar_nav_month_nudger_next"));  //next button to change the months
        //this is the select drop-down with the month and the year on it, we will use this object everytime when we click next to verify the month and the year is it that one that we want
        Select dateSelected = new Select(driver.findElement(By.id("#depart-calendar__bpk_calendar_nav_select")));
        while (true) {
            next.click(); //every click will switch to next month of the year
            //the reason of 0 index is that allSelectedOptions will return a list,will return WebElement, we will get the text from it and check equalsIgnoreCase is it the same as we ask for
            if (dateSelected.getAllSelectedOptions().get(0).getText().equalsIgnoreCase("May 2022")) {
                break;  //to break the loop until we didn`t get to May 2022
            }
        }//one we select the year we will select the date
        //the whole elements that hold the calendar inside- all the days as number and day of the week
        List<WebElement> dates = driver.findElements(By.xpath("//table[contains(@class,'FlightDatepicker_fsc-datepicker')]/tbody//td//span")); //and loop to find the correct date through all the dates from the calendar
        for(WebElement date: dates){
            if(date.getText().equalsIgnoreCase("6")){
                date.click();
                break;
            }
        }

    }
}
