package Utilities;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HookFile {
    public static WebDriver driver;
    @Before
    public void startDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.navigate().to("https://medsultoadmin-staging1.azurewebsites.net/");
    }
    @After
    public void stopDriver(){
        driver.quit();
    }
}
