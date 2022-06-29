import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumWindowHandle {
   WebDriver driver;
    @Test
    public void TestWindowHandle() throws InterruptedException {
        String path=System.getProperty("user.dir");
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver", path+"/src/main/Drivers/chromedriver");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.get("https://www.makemytrip.com");

        driver.findElement(By.cssSelector("#toCity")).click();
       /* Set<String> str= driver.getWindowHandles();
        Iterator<String> itr= str.iterator();
        String parent= itr.next();
        String child=itr.next();
               */
       // driver.findElement(By.xpath("//div[@class='entry-box clearfix']/div/p/a[@xpath='1']")).click();
      //driver.findElement(By.xpath("//div[@class='entry-box clearfix']/div/p/a[@xpath='1']")).click();

       // driver.quit();
       // Runtime.getRuntime().exec("AutoIt path");
        List<WebElement> lst= driver.findElements(By.xpath("//ul[@role='listbox']"));
        System.out.println(lst.size());
      /*  for (WebElement q:lst) {
            System.out.println(q.getText());
            Thread.sleep(2000);
            if(q.getText().equals("Mumbai, India")){
                q.click();
                break;
            }
            break;
        }*/
        Thread.sleep(2000);
      //  driver.quit();

        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span")));
        boolean status=we.isDisplayed();

    }
}
