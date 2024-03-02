package page.objects.IMDbPO.IMDb8BodyBagsSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb8ClickOnBodyBagsTvMoviePO extends BaseActions {

    private By chooseBodyBagsTvMovie =  By.xpath(" //*[@id=\"__next\"]/main/div[2]/div[3]/section/section/div/section/section/div[2]/div/section/div[2]/div[2]/ul/li[1]/div/div/div/div[1]/div[2]/div[1]/a/h3");


    public IMDb8ClickOnBodyBagsTvMoviePO clickOnBodyBagsTvMoviePO(){
        waitForElement(chooseBodyBagsTvMovie);
        actionClick(chooseBodyBagsTvMovie);
        return this;
    }
}
