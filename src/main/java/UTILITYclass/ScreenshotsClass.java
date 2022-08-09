package UTILITYclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotsClass
{
 WebDriver driver;
 
 public static void ScreenshotsOrangeHRM(WebDriver driver , String SSName) throws IOException
 {
       TakesScreenshot TSS = (TakesScreenshot)driver;
       File Source =TSS.getScreenshotAs(OutputType.FILE);
       File Destination =new File ("./ScreenshotFolder/OrangeHRM"+SSName+".jpg");
       FileHandler.copy(Source, Destination);
 }      
}
