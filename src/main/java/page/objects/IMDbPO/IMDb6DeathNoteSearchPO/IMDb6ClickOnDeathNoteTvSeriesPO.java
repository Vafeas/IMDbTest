package page.objects.IMDbPO.IMDb6DeathNoteSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;


public class IMDb6ClickOnDeathNoteTvSeriesPO extends BaseActions {

    private By chooseDeathNoteTvSeries =  By.xpath("//*[@id=\"__next\"]/main/div[2]/div[3]/section/section/div/section/section/div[2]/div/section/div[2]/div[2]/ul/li/div/div/div/div[1]/div[2]/div[1]/a/h3");


    public IMDb6ClickOnDeathNoteTvSeriesPO clickOnDeathNoteTvSeriesPO(){
        waitForElement(chooseDeathNoteTvSeries);
        actionClick(chooseDeathNoteTvSeries);
        return this;
    }
}
