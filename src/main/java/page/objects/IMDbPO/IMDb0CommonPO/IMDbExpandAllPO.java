package page.objects.IMDbPO.IMDb0CommonPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDbExpandAllPO extends BaseActions {

    private By pressExtractAllButton = By.xpath("//button[@data-testid='adv-search-expand-all']");

    public IMDbExpandAllPO clickAllButton() {
        waitForElement(pressExtractAllButton);
        click(pressExtractAllButton);
        return this;
    }
}

