
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import use.Waiter;
import use.WebDriverHelp;

import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;

import static use.WebDriverHelp.getDriver;

public abstract class TestBase {

    @BeforeClass
    @Parameters("browser")
    public void startRemoteServer(String browser) {
        WebDriverHelp.startDriverSession(browser);
    }
    @BeforeMethod
    public void startDriver() {
        getDriver().get("https://www.evoca.am/hy/");
    }
    @AfterMethod
    public void quitDriver() {
        WebDriverHelp.getDriver().quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)getDriver();
            File screenshot = ((TakesScreenshot) camera).getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        getDriver().quit();
    }

}