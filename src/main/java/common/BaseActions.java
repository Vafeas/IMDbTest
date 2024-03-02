package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions{

    public WebDriver getDriver() {

        return WebDriverFactory.getDriver();
    }
    public WebDriverWait getWait() {

        return WebDriverFactory.getWait();
    }
    public void waitForElement(By locator) {

        getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void click(By locator) {
        waitForElement(locator);
        getDriver().findElement(locator).click();
    }
    public void actionClick(By locator){
        Actions action = new Actions(getDriver());
        waitForElement(locator);
        WebElement element= getDriver().findElement(locator);
        action.moveToElement(element).click().perform();
    }
    public void input(By locator, String typeValueOnSearchBar) {
        waitForElement(locator);
        getDriver().findElement(locator).sendKeys(typeValueOnSearchBar);
    }
    public void verify(By locator){
        waitForElement(locator);
        getDriver().findElement(locator).isDisplayed();
    }
}