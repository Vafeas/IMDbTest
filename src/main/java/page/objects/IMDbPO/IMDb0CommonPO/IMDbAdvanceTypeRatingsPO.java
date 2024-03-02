package page.objects.IMDbPO.IMDb0CommonPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class IMDbAdvanceTypeRatingsPO extends BaseActions {

    private By TypeRatingBar1 = By.xpath("//input[@id='text-input__12']");

    private By TypeRatingBar2 = By.xpath("//input[@id='text-input__13']");

    public String typingValueOnRatingBar1(String typeValueOnSearchBar){
        waitForElement(TypeRatingBar1);
        actionClick(TypeRatingBar1);
        input(TypeRatingBar1, typeValueOnSearchBar);
        return this.toString();
    }
    public String typingValueOnRatingBar2(String typeValueOnSearchBar){
        waitForElement(TypeRatingBar2);
        actionClick(TypeRatingBar2);
        input(TypeRatingBar2, typeValueOnSearchBar);
        return this.toString();
    }
}
