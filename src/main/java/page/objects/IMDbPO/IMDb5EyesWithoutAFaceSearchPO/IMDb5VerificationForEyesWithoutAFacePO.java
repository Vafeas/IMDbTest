package page.objects.IMDbPO.IMDb5EyesWithoutAFaceSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb5VerificationForEyesWithoutAFacePO extends BaseActions {

    private By theEyesWithoutAFaceYearOfReleaseIs = By.xpath(" //div/ul/li/a[contains(text(),'1960')]");
    private By theEyesWithoutAFacePrimaryTextIs = By.xpath("//span[@data-testid='hero__primary-text']");

    public Boolean verifyEyesWithoutAFacePrimaryText(){
        waitForElement(theEyesWithoutAFacePrimaryTextIs);
        verify(theEyesWithoutAFacePrimaryTextIs);
        return true;
    }
    public Boolean verifyEyesWithoutAFaceYearOfRelease(){
        waitForElement(theEyesWithoutAFaceYearOfReleaseIs);
        verify(theEyesWithoutAFaceYearOfReleaseIs);
        return true;
    }
}

