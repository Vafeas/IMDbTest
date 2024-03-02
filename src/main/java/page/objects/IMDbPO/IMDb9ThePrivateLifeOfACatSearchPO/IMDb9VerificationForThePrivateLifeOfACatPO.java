package page.objects.IMDbPO.IMDb9ThePrivateLifeOfACatSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb9VerificationForThePrivateLifeOfACatPO extends BaseActions {

    private By theThePrivateLifeOfACatYearOfReleaseIs = By.cssSelector("section.ipc-page-section>div>div > ul >li.ipc-inline-list__item:nth-child(1) > a");
    private By theThePrivateLifeOfACatPrimaryTextIs = By.xpath("//span[@data-testid='hero__primary-text']");

    public Boolean verifyThePrivateLifeOfACatShortPrimaryText(){
        waitForElement(theThePrivateLifeOfACatPrimaryTextIs);
        verify(theThePrivateLifeOfACatPrimaryTextIs);
        return true;
    }
    public Boolean verifyThePrivateLifeOfACatShortYearOfRelease(){
        waitForElement(theThePrivateLifeOfACatYearOfReleaseIs);
        verify(theThePrivateLifeOfACatYearOfReleaseIs);
        return true;
    }
}
