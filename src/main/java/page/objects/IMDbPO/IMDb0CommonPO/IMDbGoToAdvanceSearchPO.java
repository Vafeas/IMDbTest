package page.objects.IMDbPO.IMDb0CommonPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDbGoToAdvanceSearchPO extends BaseActions {

    private By pressAllButton  = By.xpath("//form[@id='nav-search-form']/div[1]/div/label/span");
    private By chooseAdvanceSearch = By.xpath("//span[@id='navbar-search-category-select-contents']/ul/a");

    public IMDbGoToAdvanceSearchPO clickAllButton(){
        waitForElement(pressAllButton);
        click(pressAllButton);
        return this;
    }
    public IMDbGoToAdvanceSearchPO clickAdvanceSearch() {
        waitForElement(chooseAdvanceSearch);
        click(chooseAdvanceSearch);
        return this;
    }
}


