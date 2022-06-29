import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.copyDirectory;

public class TakeSsSelenium
{
     WebDriver driver;

    @Test
    public void m1() throws IOException {
        String path=System.getProperty("user.dir");
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver", path+"/src/main/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationstepbystep.com/");
        TakesScreenshot scrshot=((TakesScreenshot) driver);
        File source= scrshot.getScreenshotAs(OutputType.FILE);
        File dest= new File("/Users/parvez/IdeaProjects/FirstDemoProject/src/Reports/test.png");
       // FileUtils.copyDirectory(source,dest);
        FileUtils.copyDirectory(source,dest);
    }
}
