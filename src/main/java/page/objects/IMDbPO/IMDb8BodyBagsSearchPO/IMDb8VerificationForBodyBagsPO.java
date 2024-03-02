package page.objects.IMDbPO.IMDb8BodyBagsSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb8VerificationForBodyBagsPO extends BaseActions {

    private By theBodyBagsYearOfReleaseIs = By.cssSelector("section.ipc-page-section>div>div > ul >li.ipc-inline-list__item:nth-child(2) > a");
    private By theBodyBagsPrimaryTextIs = By.xpath("//span[@data-testid='hero__primary-text']");

    public Boolean verifyBodyBagsTvMoviePrimaryText(){
        waitForElement(theBodyBagsPrimaryTextIs);
        verify(theBodyBagsPrimaryTextIs);
        return true;
    }
    public Boolean verifyBodyBagsTvMovieYearOfRelease(){
        waitForElement(theBodyBagsYearOfReleaseIs);
        verify(theBodyBagsYearOfReleaseIs);
        return true;
    }
}
