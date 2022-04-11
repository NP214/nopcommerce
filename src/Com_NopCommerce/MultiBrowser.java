package Com_NopCommerce;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static WebDriver driver;
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static String browser = "chrome";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Browser not found");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println(title);
        // print current URL
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        //Print the page source
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        WebElement emailID = driver.findElement(By.id("Email"));
        // enter the email ID
        emailID.sendKeys("prime123@gmail.com");
        // enter the password
        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.sendKeys("prime123");
        // close the browser
        driver.close();

    }

}


