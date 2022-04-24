package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import use.Waiter;

import static use.WebDriverHelp.getDriver;


public abstract class BasePage {
    public static WebDriver webDriver;
    public static String baseURL = "https://www.evoca.am/hy/";

    public BasePage() {
        webDriver = getDriver();
    }
    public abstract String getUrl();

    public boolean isElementDisplayed(By location) {
        return findElement(location).isDisplayed();
    }
    public WebElement findElement(By location) {
        Waiter.getInstance().displayElement(location);
        return webDriver.findElement(location);
    }
    public String getCurrentURL(){
        return  webDriver.getCurrentUrl();
    }

}
