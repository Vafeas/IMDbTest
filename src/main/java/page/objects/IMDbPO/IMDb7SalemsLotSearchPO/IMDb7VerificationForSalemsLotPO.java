package page.objects.IMDbPO.IMDb7SalemsLotSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb7VerificationForSalemsLotPO extends BaseActions {

    private By theSalemsLotYearOfReleaseIs = By.cssSelector("section.ipc-page-section>div>div > ul >li.ipc-inline-list__item:nth-child(2) > a");
    private By theSalemsLotPrimaryTextIs = By.xpath("//span[@data-testid='hero__primary-text']");

    public Boolean verifySalemsLotTvMiniSeriesPrimaryText(){
        waitForElement(theSalemsLotPrimaryTextIs);
        verify(theSalemsLotPrimaryTextIs);
        return true;
    }
    public Boolean verifySalemsLotTvMiniSeriesYearOfRelease(){
        waitForElement(theSalemsLotYearOfReleaseIs);
        verify(theSalemsLotYearOfReleaseIs);
        return true;
    }
}

