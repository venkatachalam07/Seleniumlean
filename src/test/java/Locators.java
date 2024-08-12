import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("DSDSGD");
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.trainingintambaram.net/selenium-training-in-chennai/");
        driver.manage().window().maximize();

        // Locators in selenium

        // id
        // name
        //xpath
        // tegname [contains(@type .'sub')]
        //linkText ,xpath Text

        // start with xpath   ---->>>>>>>  //tegname[starts-with(@attribute,'msg')]

        // tagname[text()='element text'];


        driver.findElement(By.linkText("Day – 1 Task")) .click();    //linkText


        driver.close();


        // Css selector only user Id before # simple cant users name ,@atributes ,Text , attributes Values


        Thread.sleep(4000);

        WebDriverManager.chromedriver().setup();
        WebDriver driver1 =new ChromeDriver();

        driver1.get("https://login.yahoo.com/");
     WebElement username = driver1.findElement(By.cssSelector("#login-username"));
     username.click();
     username.sendKeys("Venkatyahoo.com");
     driver1.manage().window().maximize();


        driver.close();

//    css selectors


        WebDriverManager.chromedriver().setup();
        WebDriver driver2 =new ChromeDriver();

        driver2.get("https://www.ebay.com/ ");
        driver2.manage().window().maximize();

        JavascriptException js= (JavascriptException) driver2;

      //   js.executeScript("window.screenBy(0,400");












    }


}
