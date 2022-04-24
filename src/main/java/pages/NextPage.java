package pages;

import locators.NextPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import use.Waiter;
import use.WebDriverHelp;

public class NextPage extends BasePage {
    private By moreInfo=By.xpath(NextPageLocators.moreInfo);
    private By loanText=By.xpath(NextPageLocators.loanText);
    private By imageIcon=By.xpath(NextPageLocators.imageIcon);
    private By logo=By.xpath(NextPageLocators.logo);
    @Override
    public String getUrl() {
        return baseURL+"loans/";
    }
    public NextPageItem clicker(){
        WebElement m = Waiter.getInstance().WebElementToBeClickable(moreInfo);
        m.click();
        return new NextPageItem();
    }
    public boolean isLoanTextExists() {
        return isElementDisplayed(loanText);
    }
    public boolean isHomeImageExists() {
        return isElementDisplayed(imageIcon);
    }
    public NextPage clickLogo(){
        WebElement webElement = Waiter.getInstance().WebElementToBeClickable(logo);
        webElement.click();
        return new NextPage();
    }

}
