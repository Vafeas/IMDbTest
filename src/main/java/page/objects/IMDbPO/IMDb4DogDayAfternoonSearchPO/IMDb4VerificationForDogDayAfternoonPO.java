package page.objects.IMDbPO.IMDb4DogDayAfternoonSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb4VerificationForDogDayAfternoonPO extends BaseActions {

    private By theDogDayAfternoonYearOfReleaseIs = By.xpath(" //div/ul/li/a[contains(text(),'1975')]");
    private By theDogDayAfternoonPrimaryTextIs = By.xpath("//span[@data-testid='hero__primary-text']");

    public Boolean verifyDogDayAfternoonPrimaryText(){
        waitForElement(theDogDayAfternoonPrimaryTextIs);
        verify(theDogDayAfternoonPrimaryTextIs);
        return true;
    }
    public Boolean verifyDogDayAfternoonYearOfRelease(){
        waitForElement(theDogDayAfternoonYearOfReleaseIs);
        verify(theDogDayAfternoonYearOfReleaseIs);
        return true;
    }
}

