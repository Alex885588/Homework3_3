package use;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebDriverHelp {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void startDriverSession(String browserProperty) {
        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setBrowserName(browserProperty);
            driver = new RemoteWebDriver(new URL("http://localhost:4444/"), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
