package page.objects.IMDbPO.IMDb5EyesWithoutAFaceSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb5ClickOnEyesWithoutAFaceMoviePO extends BaseActions {

//    Movie 5: 'Eyes Without A Face' (1960)

    private By chooseEyesWithoutAFaceMovie =  By.xpath("//section[@data-testid='find-results-section-title']/div[2]/ul//a[contains(@href,'/tt0053459/')]");


    public IMDb5ClickOnEyesWithoutAFaceMoviePO clickOnEyesWithoutAFaceMoviePO(){
        waitForElement(chooseEyesWithoutAFaceMovie);
        click(chooseEyesWithoutAFaceMovie);
        return this;
    }

}


