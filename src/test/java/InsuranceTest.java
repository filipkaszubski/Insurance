import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class InsuranceTest {


        @Test
        public void ForTest()  {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("window-position=2000,0");
            ChromeDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://demo.borland.com/InsuranceWebExtJS/");


            WebElement signin = driver.findElementById("login-form:signup");
            signin.click();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement imie = driver.findElementById("signup:fname");
            imie.click();
            imie.sendKeys("Tom");
            WebElement nazwisko = driver.findElementById("signup:lname");
            nazwisko.click();
            nazwisko.sendKeys("Hanks");
            WebElement email = driver.findElementById("signup:email");
            email.click();

            email.sendKeys("1234@o2.pl");

            WebElement addres1 = driver.findElementById("signup:street");
            addres1.click();
            addres1.sendKeys("piekna");
            WebElement city = driver.findElementById("signup:city");
            city.click();
            city.sendKeys("Lodz");
            Select state = new Select(driver.findElementById("signup:state"));
            state.selectByValue("CO");
            WebElement code = driver.findElementById("signup:zip");
            code.click();
            code.sendKeys("00000");
            WebElement pass = driver.findElementById("signup:password");
            pass.click();
            pass.sendKeys("11111");

            WebElement register = driver.findElementById("signup:signup");
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            register.click();


        }
    }


