package pages;

import locators.NextPageItemLocators;
import org.openqa.selenium.By;

public class NextPageItem extends BasePage{
    private By image = By.xpath(NextPageItemLocators.image);
    @Override
    public String getUrl() {
        return baseURL+"loans/housing-mortgages-for-non-resident-individuals/";
    }
    public boolean isImageExists() {
        return isElementDisplayed(image);
    }
}
