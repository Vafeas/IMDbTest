package page.objects.IMDbPO.IMDb0CommonPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDbExactMatchesFilterPO extends BaseActions {

    private By ExactMatchesFilter = By.xpath("/html/body/div[2]/main/div[2]/div[3]/section/div/div[1]/section[2]/div[1]/div/div/a/span");

    public IMDbExactMatchesFilterPO clickExactMach(){
        waitForElement(ExactMatchesFilter);
        click(ExactMatchesFilter);
        return this;
    }
}
