package page.objects.IMDbPO.IMDb2PossessionSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb2VerificationForPossessionPO extends BaseActions {

    private By thePossessionYearOfReleaseIs = By.xpath(" //div/ul/li/a[contains(text(),'1981')]");
    private By thePossessionPrimaryTextIs = By.xpath("//span[@data-testid='hero__primary-text']");

    public Boolean verifyPossessionPrimaryText(){
        waitForElement(thePossessionPrimaryTextIs);
        verify(thePossessionPrimaryTextIs);
        return true;
    }
    public Boolean verifyPossessionYearOfRelease(){
        waitForElement(thePossessionYearOfReleaseIs);
        verify(thePossessionYearOfReleaseIs);
        return true;
    }
}

