package page.objects.IMDbPO.IMDb10TheFirstResultFromAdvanceSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb10VerificationForTheFirstResultPO extends BaseActions {

    private By theFirstResultGenreIsHorror = By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[1]/section/div[1]/div[2]/a[1]");
    private By theFirstResultAwardsIsOscarWinning = By.xpath("//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[1]/div/ul/li/a[1]");

    public Boolean verifyTheFirstResultGenre(){
        waitForElement(theFirstResultGenreIsHorror);
        verify(theFirstResultGenreIsHorror);
        return true;
    }
    public Boolean verifyTheFirstResultAwards(){
        waitForElement(theFirstResultAwardsIsOscarWinning);
        verify(theFirstResultAwardsIsOscarWinning);
        return true;
    }
}
