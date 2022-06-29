package seleniumpackage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class CollectionSeleniumPractive
{
    @Test

    public void TestCollection(){
        WebDriver driver;
        //String path=System.getProperty("/Users/parvez/IdeaProjects/FirstDemoProject");
        // System.out.println(path);
        System.setProperty("webdriver.chrome.driver", "/Users/parvez/IdeaProjects/FirstDemoProject/src/main/Drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://api.freecrm.com/register/");
        driver.findElement(By.cssSelector(".search[autocomplete='off']")).click();
       List<WebElement> lst= driver.findElements(By.xpath("//div[@class='menu transition visible']//following-sibling::div"));
        System.out.println(lst.size());

        //System.out.println(lst.get(0).getText());
       // System.out.println(lst.len);
        int p=0;
//       for(WebElement u:lst){
//          // if(u.getText().startsWith("Indi")==true) {
//               System.out.println(u.getText());
//          // }
//        }


        for (int i=0;i< lst.size();i++){
           // System.out.println(lst.get(i));
           if(lst.get(i).getText().startsWith("Indon")==true) {
               lst.get(i).click();
               switch (lst.get(i).getText()) {


                    case "India (+91)":
                        System.out.println("India is selected in SWitc");
                        break;
                    case "Hong Kong (+852)":
                        System.out.println("HK is selected");
                        break;
                    default:
                        System.out.println("No Value");
                }
            }
        }


    }
}
