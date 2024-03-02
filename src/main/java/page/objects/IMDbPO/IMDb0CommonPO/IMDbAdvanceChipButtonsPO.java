package page.objects.IMDbPO.IMDb0CommonPO;

import common.BaseActions;
import org.openqa.selenium.By;


public class IMDbAdvanceChipButtonsPO extends BaseActions {

     private By tvSeriesButton = By.xpath("//div[@class='ipc-accordion__item ipc-accordion__item--expanded' and @id='titleTypeAccordion']//button[contains(@class, 'ipc-chip--on-base')][2]");

     private By tvMiniSeriesButton = By.xpath("//div[@class='ipc-accordion__item ipc-accordion__item--expanded' and @id='titleTypeAccordion']//button[contains(@class, 'ipc-chip--on-base')][5]");

     private By tvMovieButton = By.xpath("//div[@class='ipc-accordion__item ipc-accordion__item--expanded' and @id='titleTypeAccordion']//button[contains(@class, 'ipc-chip--on-base')][6]");

     private By animationButton = By.xpath("//div[@class='ipc-accordion__item ipc-accordion__item--expanded' and @id='genreAccordion']//button[contains(@class, 'ipc-chip--on-base')][3]");

     private By horrorButton = By.xpath("//div[@class='ipc-accordion__item ipc-accordion__item--expanded' and @id='genreAccordion']//button[contains(@class, 'ipc-chip--on-base')][14]");

     private By shortButton = By.xpath("//div[@class='ipc-accordion__item ipc-accordion__item--expanded' and @id='titleTypeAccordion']//button[contains(@class, 'ipc-chip--on-base')][3]");

     private By documentaryButton = By.xpath("//div[@class='ipc-accordion__item ipc-accordion__item--expanded' and @id='genreAccordion']//button[contains(@class, 'ipc-chip--on-base')][7]");

     private By movieButton = By.xpath("//div[@class='ipc-accordion__item ipc-accordion__item--expanded' and @id='titleTypeAccordion']//button[contains(@class, 'ipc-chip--on-base')][1]");

     private By oscarWinningButton = By.xpath("//div[@class='ipc-accordion__item ipc-accordion__item--expanded' and @id='awardsAccordion']//button[contains(@class, 'ipc-chip--on-base')][1]");



    public IMDbAdvanceChipButtonsPO pressTvSeriesButton(){
        waitForElement(tvSeriesButton);
        actionClick(tvSeriesButton);
        return this;
    }
    public IMDbAdvanceChipButtonsPO pressTvMiniSeriesButton(){
        waitForElement(tvMiniSeriesButton);
        actionClick(tvMiniSeriesButton);
        return this;
    }
    public IMDbAdvanceChipButtonsPO pressTvMovieButton(){
        waitForElement(tvMovieButton);
        actionClick(tvMovieButton);
        return this;
    }

    public IMDbAdvanceChipButtonsPO pressAnimationButton(){
        waitForElement(animationButton);
        actionClick(animationButton);
        return this;

    }
    public IMDbAdvanceChipButtonsPO pressHorrorButton() {
        waitForElement(horrorButton);
        actionClick(horrorButton);
        return this;
    }

    public IMDbAdvanceChipButtonsPO pressShortButton() {
        waitForElement(shortButton);
        actionClick(shortButton);
        return this;
    }
    public IMDbAdvanceChipButtonsPO pressDocumentaryButton() {
        waitForElement(documentaryButton);
        actionClick(documentaryButton);
        return this;
    }
    public IMDbAdvanceChipButtonsPO pressMovieButton() {
        waitForElement(movieButton);
        actionClick(movieButton);
        return this;
    }
    public IMDbAdvanceChipButtonsPO pressOscarWinningButton() {
        waitForElement(oscarWinningButton);
        actionClick(oscarWinningButton);
        return this;
    }
}



