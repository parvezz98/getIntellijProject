import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestwithMain
{

    public static void main(String[] args){
        String path=System.getProperty("user.dir");
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver", path+"/src/main/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }}
