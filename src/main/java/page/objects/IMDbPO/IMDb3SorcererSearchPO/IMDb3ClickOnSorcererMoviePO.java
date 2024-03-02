package page.objects.IMDbPO.IMDb3SorcererSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;


public class IMDb3ClickOnSorcererMoviePO extends BaseActions{

//   Movie 3: 'Sorcerer' (1977)

    private By chooseSorcererMovie =  By.xpath("//section[@data-testid='find-results-section-title']/div[2]/ul//a[text()='Sorcerer']");

    public IMDb3ClickOnSorcererMoviePO clickOnSorcererMoviePO(){
        waitForElement(chooseSorcererMovie);
        click(chooseSorcererMovie);
        return this;
    }

}
