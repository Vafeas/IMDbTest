package page.objects.IMDbPO.IMDb3SorcererSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb3VerificationForSorcererPO extends BaseActions {

    private By theSorcererYearOfReleaseIs = By.xpath(" //div/ul/li/a[contains(text(),'1977')]");
    private By theSorcererPrimaryTextIs = By.xpath("//span[@data-testid='hero__primary-text']");

    public Boolean verifySorcererPrimaryText(){
        waitForElement(theSorcererPrimaryTextIs);
        verify(theSorcererPrimaryTextIs);
        return true;
    }
    public Boolean verifySorcererYearOfRelease(){
        waitForElement(theSorcererYearOfReleaseIs);
        verify(theSorcererYearOfReleaseIs);
        return true;
    }
}

