package page.objects.IMDbPO.IMDb0CommonPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDbAdvanceTypeDatesPO extends BaseActions {


    private By TypeDateBar1 = By.xpath("//input[@id='text-input__6']");

    private By TypeDateBar2 = By.xpath("//input[@id='text-input__7']");

    public String typingValueOnDateBar1(String typeValueOnSearchBar){
        waitForElement(TypeDateBar1);
        actionClick(TypeDateBar1);
        input(TypeDateBar1, typeValueOnSearchBar);
        return this.toString();
    }
    public String typingValueOnDateBar2(String typeValueOnSearchBar){
        waitForElement(TypeDateBar2);
        actionClick(TypeDateBar2);
        input(TypeDateBar2, typeValueOnSearchBar);
        return this.toString();
    }
}
