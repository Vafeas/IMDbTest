package page.objects.IMDbPO.IMDb10TheFirstResultFromAdvanceSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb10ClickTheFirstResultPO extends BaseActions {

    private By chooseFirstResult = By.xpath("//ul/li[1]//a[@class='ipc-title-link-wrapper']");


    public IMDb10ClickTheFirstResultPO clickOnTheFirstResult(){
        waitForElement(chooseFirstResult);
        click(chooseFirstResult);
        return this;
    }
}
