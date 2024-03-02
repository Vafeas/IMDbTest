package page.objects.IMDbPO.IMDb0CommonPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDbAdvanceExcludeTikPO extends BaseActions {

    private By TikDocumentary = By.xpath("//input[@id='exclude-documentary-checkbox']");

    private By TikShort = By.xpath("//input[@id='exclude-short-checkbox']");

    public IMDbAdvanceExcludeTikPO tikDocumetaryBox(){
        waitForElement(TikDocumentary);
        actionClick(TikDocumentary);
        return this;
    }
    public IMDbAdvanceExcludeTikPO tikShortBox(){
        waitForElement(TikShort);
        actionClick(TikShort);
        return this;

    }
}
