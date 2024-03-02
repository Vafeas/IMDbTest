package page.objects.IMDbPO.IMDb0CommonPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDbAcceptTermsPO extends BaseActions {

    private By clickOnTerms = By.xpath("//button[@data-testid='accept-button']");

    public IMDbAcceptTermsPO clickTerms(){
        waitForElement(clickOnTerms);
        click(clickOnTerms);
        return this;
    }
}

