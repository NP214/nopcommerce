package Com_NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // set up chrome browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // open URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // print title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // print current URL
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        //Print the page source
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
   WebElement emailID = driver.findElement(By.id("Email"));
//      // enter the email ID
      emailID.sendKeys("prime123@gmail.com");
//      // enter the password
      WebElement passWord = driver.findElement(By.id("Password"));
      passWord.sendKeys("prime123");
      // close the browser
        driver.close();















    }
    }