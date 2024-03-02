package page.objects.IMDbPO.IMDb4DogDayAfternoonSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDb4ClickOnDogDayAfternoonMoviePO extends BaseActions {

//    Movie 4: 'Dog Day Afternoon' (1975)

    private By chooseDogDayAfternoonMovie =  By.xpath("//section[@data-testid='find-results-section-title']/div[2]/ul//a[text()='Dog Day Afternoon']");

    public IMDb4ClickOnDogDayAfternoonMoviePO clickOnDogDayAfternoonMoviePO(){
        waitForElement(chooseDogDayAfternoonMovie);
        click(chooseDogDayAfternoonMovie);
        return this;
    }

}