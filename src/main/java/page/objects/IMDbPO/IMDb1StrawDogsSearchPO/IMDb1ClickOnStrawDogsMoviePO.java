package page.objects.IMDbPO.IMDb1StrawDogsSearchPO;

import common.BaseActions;
import org.openqa.selenium.By;


public class IMDb1ClickOnStrawDogsMoviePO extends BaseActions{

//   Movie 1: 'Straw Dogs' (1971)

    private By chooseStrawDogsMovie =  By.xpath("//section[@data-testid='find-results-section-title']/div[2]/ul//a[text()='Straw Dogs']");


    public IMDb1ClickOnStrawDogsMoviePO clickOnStrawDogsMoviePO(){
        waitForElement(chooseStrawDogsMovie);
        click(chooseStrawDogsMovie);
        return this;
    }
}
