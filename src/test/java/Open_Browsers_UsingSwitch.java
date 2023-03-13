import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Open_Browsers_UsingSwitch {
    public static void main(String[] args) throws InterruptedException {
        String browser = "chrome";
        WebDriver driver;
        switch ("edge")
        {
            case "chrome":
                //1- Define the bridge using one of two techniques (System.setProperty, WebDriverManager) switch
                driver = new ChromeDriver();
                //2- Create new object from WebDriver Interface
                driver.manage().window().maximize();

                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                //4- User go to the website
                driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
                // wait for 3 seconds before quitting the driver using sleep() method inside Thread class (Java)‏
                // last Step
                Thread.sleep(3);
                driver.quit();
                break;
            case "firefox":
                //1- Define the bridge using one of two techniques (System.setProperty, WebDriverManager) switch
                driver = new FirefoxDriver();
                //2- Create new object from WebDriver Interface
                driver.manage().window().maximize();

                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                //4- User go to the website
                driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
                // wait for 3 seconds before quitting the driver using sleep() method inside Thread class (Java)‏
                // last Step
                Thread.sleep(3);
                driver.quit();
                break;
            case "edge":
                //1- Define the bridge using one of two techniques (System.setProperty, WebDriverManager) switch
                driver = new EdgeDriver();
                //2- Create new object from WebDriver Interface
                driver.manage().window().maximize();

                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                //4- User go to the website
                driver.navigate().to("https://staging2.fabrica-dev.com/humhum-user/");
                // wait for 3 seconds before quitting the driver using sleep() method inside Thread class (Java)‏
                // last Step
                Thread.sleep(3);
                driver.quit();
                break;

        }

    }
}
