package page.objects.IMDbPO.IMDb1StrawDogsSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb1VerificationForStrawDogsPO extends BaseActions {

    private By theStrawDogsYearOfReleaseIs = By.xpath(" //div/ul/li/a[contains(text(),'1971')]");

    private By theStrawDogsPrimaryTextIs = By.xpath("//span[@data-testid='hero__primary-text']");

    public Boolean verifyStrawDogsPrimaryText(){
        waitForElement(theStrawDogsPrimaryTextIs);
        verify(theStrawDogsPrimaryTextIs);
        return true;
    }
    public Boolean verifyStrawDogsYearOfRelease(){
        waitForElement(theStrawDogsYearOfReleaseIs);
        verify(theStrawDogsYearOfReleaseIs);
        return true;
    }
}

