package page.objects.IMDbPO.IMDb0CommonPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDbSearchBarPO extends BaseActions {
    private By ValueOnSearchBar = By.xpath("//input[@id='suggestion-search']");
    private By SubmitButton = By.xpath("//button[@id='suggestion-search-button']");

    public String typingValueOnSearchBar(String typeValueOnSearchBar){
        waitForElement(ValueOnSearchBar);
        click(ValueOnSearchBar);
        input(ValueOnSearchBar, typeValueOnSearchBar);
        return this.toString();
    }
    public IMDbSearchBarPO clickTheSubmitButton(){
        waitForElement(SubmitButton);
        click(SubmitButton);
        return this;
    }
}
