package page.objects.IMDbPO.IMDb6DeathNoteSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb6VerificationForDeathNotePO extends BaseActions {

    private By theDeathNoteYearOfReleaseIs = By.cssSelector("section.ipc-page-section>div>div > ul >li.ipc-inline-list__item:nth-child(2) > a");
    private By theDeathNotePrimaryTextIs = By.xpath("//span[@data-testid='hero__primary-text']");

    public Boolean verifyDeathNoteTvSeriesPrimaryText(){
        waitForElement(theDeathNotePrimaryTextIs);
        verify(theDeathNotePrimaryTextIs);
        return true;
    }
    public Boolean verifyDeathNoteTvSeriesYearOfRelease(){
        waitForElement(theDeathNoteYearOfReleaseIs);
        verify(theDeathNoteYearOfReleaseIs);
        return true;
    }
}
