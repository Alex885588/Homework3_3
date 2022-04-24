package use;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Waiter {
    private static final Duration DURATION = Duration.ofSeconds(25);
    public static Waiter getInstance() {
        return new Waiter();
    }

    public WebElement displayElement(By location) {
        return new WebDriverWait(WebDriverHelp.getDriver(), DURATION).until(ExpectedConditions.visibilityOfElementLocated(location));
    }

    public WebElement WebElementToBeClickable(By location){
        return new WebDriverWait(WebDriverHelp.getDriver(),DURATION).until(ExpectedConditions.elementToBeClickable(location));

    }
}
