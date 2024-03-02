package page.objects.IMDbPO.IMDb9ThePrivateLifeOfACatSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb9ClickOnThePrivateLifeOfACatShortPO extends BaseActions {

    private By chooseThePrivateLifeOfACatShort =  By.xpath(" //*[@id=\"__next\"]/main/div[2]/div[3]/section/section/div/section/section/div[2]/div/section/div[2]/div[2]/ul/li/div/div/div/div[1]/div[2]/div[1]/a/h3");


    public IMDb9ClickOnThePrivateLifeOfACatShortPO clickOnThePrivateLifeOfACatShortPO(){
        waitForElement(chooseThePrivateLifeOfACatShort);
        actionClick(chooseThePrivateLifeOfACatShort);
        return this;
    }
}
