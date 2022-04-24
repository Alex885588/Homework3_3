package pages;

import locators.HomePageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import use.Waiter;

public class HomePage extends BasePage{
    private By loan=By.xpath(HomePageLocators.loan);
    private By qr=By.xpath(HomePageLocators.qr);

    @Override
    public String getUrl() {
        return baseURL;
    }

    public NextPage clicker(){
        WebElement acc = Waiter.getInstance().WebElementToBeClickable(loan);
        acc.click();
        return new NextPage();
    }
    public boolean isLogoExists(){
        return isElementDisplayed(qr);
    }
}
