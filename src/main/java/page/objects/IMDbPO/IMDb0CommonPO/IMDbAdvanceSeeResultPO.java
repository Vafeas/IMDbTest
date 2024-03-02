package page.objects.IMDbPO.IMDb0CommonPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDbAdvanceSeeResultPO extends BaseActions {

    private By pressSeeResultsButton  = By.xpath("//button[@data-testid='adv-search-get-results']");

    public IMDbAdvanceSeeResultPO clickSeeResultsButton(){
        waitForElement(pressSeeResultsButton);
        click(pressSeeResultsButton);
        return this;
    }
}
