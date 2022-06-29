package seleniumpackage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class InsBackAuto {
    @Test
    public void Test1() throws InterruptedException {
        WebDriver driver;
        //String path=System.getProperty("/Users/parvez/IdeaProjects/FirstDemoProject");
        // System.out.println(path);
        System.setProperty("webdriver.chrome.driver", "/Users/parvez/IdeaProjects/FirstDemoProject/src/main/Drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.instagram.com/accounts/access_tool/current_follow_requests");

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("xyzTest");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Testtt");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[type='submit'] div")).click();
     Thread.sleep(4000);
        driver.findElement(By.xpath(" //button[@class='sqdOP yWX7d    y3zKF     ']")).click();
       for(int i=0;i<15;i++) {
           Thread.sleep(2000);
           String idToRemove = driver.findElement(By.cssSelector("article[class='PVkFi'] div:nth-child(1)")).getText();
           //String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
           //driver.findElement(By.linkText("https://www.instagram.com/")).sendKeys(selectLinkOpeninNewTab);
           driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys(idToRemove);
           Thread.sleep(4000);
           driver.findElement(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > nav:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1)")).click();
           driver.findElement(By.cssSelector("button[class='_acan _acap _acat'] div[class='_aacl _aaco _aacw _aad6 _aade']")).click();
           driver.findElement(By.cssSelector("._a9--._a9-_")).click();
           driver.navigate().back();
           driver.navigate().refresh();



       }
      /*  driver.findElement(By.cssSelector("span[data-testid='chat']")).click();
        driver.findElement(By.cssSelector("div[class='g6kkip0l p357zi0d f8m0rgwh ppled2lx tkdu00h0 gfz4du6o r7fjleex jv8uhy2r lhggkp7q qq0sjtgm ln8gz9je tm2tP copyable-area'] div div[title='Search input textbox']")).sendKeys("Sektor");
        //driver.findElement(By.cssSelector("div[class='_3Bc7H KPJpj'] div div div[class='_3uIPm WYyr1'] div[class='_3m_Xw'] div span[title='Sektorr']")).click();
        driver.findElement(By.cssSelector("div[class='_3Bc7H KPJpj'] div div div[class='_3uIPm WYyr1'] div[class='_3m_Xw'] div span[title='Sektorr']")).sendKeys("Tewrr");
        WebElement box = driver.findElement(By.cssSelector(".p3_M1"));
        box.sendKeys("Testting");

       */
    }
}