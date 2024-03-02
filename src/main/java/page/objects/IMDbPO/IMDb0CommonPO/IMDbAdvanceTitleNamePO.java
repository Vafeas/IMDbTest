package page.objects.IMDbPO.IMDb0CommonPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDbAdvanceTitleNamePO extends BaseActions {

    private By typeOnTitleName = By.xpath("//input[@id='text-input__11']");

    public String typeTitleName(String typeValueOnSearchBar) {
        waitForElement(typeOnTitleName);
        click(typeOnTitleName);
        input(typeOnTitleName, typeValueOnSearchBar);
        return this.toString();
    }
}
