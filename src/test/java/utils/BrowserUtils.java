package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class BrowserUtils {

    public static void selectByIndex(WebElement element, int indexNumber){
        Select select= new Select(element);
        select.selectByIndex(indexNumber);


    }
    public static void selectByValue(WebElement element, String value){
        Select select= new Select(element);
        select.selectByValue(value);

    }
    public  void selectByText(WebElement element, String text){
        Select select= new Select(element);
        select.selectByVisibleText(text);

    }
    public  static String takeScreenShot(){
        //WE USE getscreenshotAs method to get screenshot from our driver
        // we convert output to  FILE type
        File source=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);// INTERVIEW QUESTION
        // IN SELENIUM WE HAVE A ON METHOD THAT WE CAN TAKE A SCREENSHOT

        //System.getProperty("user.dir");---> it will give current project file directory
        // CurrentTimeMillis() ---> we use this method to get unique name for our every screenshot
        String destination=System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png";
        // it will give me current location of my project. its coming from Java ?????/ not sure , ask

        // create one File Object for Destination
        File des= new File(destination);

        try {
            FileUtils.copyFile(source, des);

        }catch(IOException e){
            e.printStackTrace();
        }

        return "des";
    }
    public  void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",
                Driver.getDriver().findElement(By.xpath("//button[@name='dwfrm_login_register']")));

    }
}

