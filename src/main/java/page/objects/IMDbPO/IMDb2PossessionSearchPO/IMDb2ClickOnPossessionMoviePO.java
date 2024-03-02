package page.objects.IMDbPO.IMDb2PossessionSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;


public class IMDb2ClickOnPossessionMoviePO extends BaseActions{

//   Movie 2: 'Possession' (1981)

    private By choosePossessionMovie =  By.xpath("//section[@data-testid='find-results-section-title']/div[2]/ul//a[text()='Possession']");

    public IMDb2ClickOnPossessionMoviePO clickOnPossessionMoviePO(){
        waitForElement(choosePossessionMovie);
        click(choosePossessionMovie);
        return this;
    }

}