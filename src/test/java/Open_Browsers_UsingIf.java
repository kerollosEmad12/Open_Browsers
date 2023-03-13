import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Open_Browsers_UsingIf {
    public static void main(String[] args) throws InterruptedException {
        String browserType = "chrome";
        //Declaration
        WebDriver driver = null;


        if (browserType.equals("edge"))
        {
            //1- Define the bridge using one of two techniques (System.setProperty, WebDriverManager)   if needed
            WebDriverManager.edgedriver().setup();

            //2- Create new object from WebDriver Interface
            //WebDriver driver = new EdgeDriver();

            //instantiation , initialization
            driver = new EdgeDriver();
        }
        else if (browserType.equals("firefox"))
        {
            //1- Define the bridge using one of two techniques (System.setProperty, WebDriverManager)   if needed
            WebDriverManager.firefoxdriver().setup();

            //2- Create new object from WebDriver Interface
            //WebDriver driver = new FirefoxDriver();

            driver = new FirefoxDriver();
        } else if (browserType.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        //3- driver Configurations
        //3.1- maximize window
        driver.manage().window().maximize();
        //3.2- implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //4- User go to the website
        driver.navigate().to("https://the-internet.herokuapp.com/login");

        // wait for 3 seconds before quitting the driver using sleep() method inside Thread class (Java)
        Thread.sleep(Duration.ofSeconds(3));
        // last Step
        driver.quit();

    }
}
