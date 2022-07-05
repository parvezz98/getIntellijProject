package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTest {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "/Users/parvez/IdeaProjects/FirstDemoProject/src/main/Drivers/chromedriver");
        WebDriver d= new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.google.com/");
        d.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Bottomline", Keys.ENTER);
      List<WebElement> allList= d.findElements(By.xpath("//h3[starts-with(text(),'Bottomline')]"));
               ////h3[contains(text(),'Bottomline')]
       for(int i=0;i<allList.size();i++){
           System.out.println(allList.get(i).getText());
       }
       d.quit();
    }
}
