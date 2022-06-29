package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class WhatsAuto {
    public static void main(String []args){


        WebDriver driver;
        //String path=System.getProperty("/Users/parvez/IdeaProjects/FirstDemoProject");
       // System.out.println(path);
        System.setProperty("webdriver.chrome.driver", "/Users/parvez/IdeaProjects/FirstDemoProject/src/main/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://web.whatsapp.com");
        driver.findElement(By.cssSelector("span[data-testid='chat']")).click();
        driver.findElement(By.cssSelector("div[class='g6kkip0l p357zi0d f8m0rgwh ppled2lx tkdu00h0 gfz4du6o r7fjleex jv8uhy2r lhggkp7q qq0sjtgm ln8gz9je tm2tP copyable-area'] div div[title='Search input textbox']")).sendKeys("Sektor");
        //driver.findElement(By.cssSelector("div[class='_3Bc7H KPJpj'] div div div[class='_3uIPm WYyr1'] div[class='_3m_Xw'] div span[title='Sektorr']")).click();
        driver.findElement(By.cssSelector("div[class='_3Bc7H KPJpj'] div div div[class='_3uIPm WYyr1'] div[class='_3m_Xw'] div span[title='Sektorr']")).sendKeys("Tewrr");
       WebElement box= driver.findElement(By.cssSelector(".p3_M1"));
     box.sendKeys("Testting");


      for(int i=0;i<=60;i++){
       box.sendKeys("Test");
         // driver.findElement(By.cssSelector(".p3_M1")).sendKeys("I love you suppu");

          //  driver.findElement(By.cssSelector("._3HQNh._1Ae7k")).click();
         // driver.findElement(By.cssSelector(".p3_M1")).sendKeys(Keys.ENTER);

      }
    }
}
