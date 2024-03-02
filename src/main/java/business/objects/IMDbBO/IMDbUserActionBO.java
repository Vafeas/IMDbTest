package business.objects.IMDbBO;

import org.testng.Assert;
import page.objects.IMDbPO.IMDb10TheFirstResultFromAdvanceSearchPO.IMDb10ClickTheFirstResultPO;
import page.objects.IMDbPO.IMDb10TheFirstResultFromAdvanceSearchPO.IMDb10VerificationForTheFirstResultPO;
import page.objects.IMDbPO.IMDb7SalemsLotSearchPO.IMDb7ClickOnSalemsLotTvMiniSeriesPO;
import page.objects.IMDbPO.IMDb7SalemsLotSearchPO.IMDb7VerificationForSalemsLotPO;
import page.objects.IMDbPO.IMDb0CommonPO.*;
import page.objects.IMDbPO.IMDb2PossessionSearchPO.IMDb2ClickOnPossessionMoviePO;
import page.objects.IMDbPO.IMDb2PossessionSearchPO.IMDb2VerificationForPossessionPO;
import page.objects.IMDbPO.IMDb1StrawDogsSearchPO.IMDb1ClickOnStrawDogsMoviePO;
import page.objects.IMDbPO.IMDb1StrawDogsSearchPO.IMDb1VerificationForStrawDogsPO;
import page.objects.IMDbPO.IMDb3SorcererSearchPO.IMDb3ClickOnSorcererMoviePO;
import page.objects.IMDbPO.IMDb3SorcererSearchPO.IMDb3VerificationForSorcererPO;
import page.objects.IMDbPO.IMDb4DogDayAfternoonSearchPO.IMDb4ClickOnDogDayAfternoonMoviePO;
import page.objects.IMDbPO.IMDb4DogDayAfternoonSearchPO.IMDb4VerificationForDogDayAfternoonPO;
import page.objects.IMDbPO.IMDb5EyesWithoutAFaceSearchPO.IMDb5ClickOnEyesWithoutAFaceMoviePO;
import page.objects.IMDbPO.IMDb5EyesWithoutAFaceSearchPO.IMDb5VerificationForEyesWithoutAFacePO;
import page.objects.IMDbPO.IMDb6DeathNoteSearchPO.IMDb6ClickOnDeathNoteTvSeriesPO;
import page.objects.IMDbPO.IMDb6DeathNoteSearchPO.IMDb6VerificationForDeathNotePO;
import page.objects.IMDbPO.IMDb8BodyBagsSearchPO.IMDb8ClickOnBodyBagsTvMoviePO;
import page.objects.IMDbPO.IMDb8BodyBagsSearchPO.IMDb8VerificationForBodyBagsPO;
import page.objects.IMDbPO.IMDb9ThePrivateLifeOfACatSearchPO.IMDb9ClickOnThePrivateLifeOfACatShortPO;
import page.objects.IMDbPO.IMDb9ThePrivateLifeOfACatSearchPO.IMDb9VerificationForThePrivateLifeOfACatPO;


public class IMDbUserActionBO {


//   IMDb Accept Terms

    IMDbAcceptTermsPO acceptTermsPO = new IMDbAcceptTermsPO();

//   IMDb Home Search Bar

    IMDbSearchBarPO searchBarPO = new IMDbSearchBarPO();

//  IMDb Exact Matches Filter

    IMDbExactMatchesFilterPO exactMatchesFilterPO = new IMDbExactMatchesFilterPO();

//  IMDb Advance Search

    IMDbGoToAdvanceSearchPO advanceSearchPO = new IMDbGoToAdvanceSearchPO();

//  Expand All Button

    IMDbExpandAllPO expandAllPO = new IMDbExpandAllPO();

//  Type on Title Name On Advance Search

    IMDbAdvanceTitleNamePO advanceFiltersPO = new IMDbAdvanceTitleNamePO();

//  Chip Buttons

    IMDbAdvanceChipButtonsPO advanceSearchGetResultsPO = new IMDbAdvanceChipButtonsPO();

//  Type on Date Bars

    IMDbAdvanceTypeDatesPO advanceTypeYear1PO = new IMDbAdvanceTypeDatesPO();

//  Type on Ratings Bars

    IMDbAdvanceTypeRatingsPO advanceTypeRatingsPO = new IMDbAdvanceTypeRatingsPO();


//  Tik the Exclude Options

    IMDbAdvanceExcludeTikPO advanceExcludeTikPO = new IMDbAdvanceExcludeTikPO();

//  Click See Results

    IMDbAdvanceSeeResultPO advanceSeeResultPO = new IMDbAdvanceSeeResultPO();

//  Movie 1: 'Straw Dogs' (1971)

    IMDb1ClickOnStrawDogsMoviePO clickOnStrawDogsMoviePO = new IMDb1ClickOnStrawDogsMoviePO();

    IMDb1VerificationForStrawDogsPO verificationForStrawDogsPO = new IMDb1VerificationForStrawDogsPO();

//  Movie 2: 'Possession' (1981)

    IMDb2ClickOnPossessionMoviePO clickOnPossessionMoviePO = new IMDb2ClickOnPossessionMoviePO();
    IMDb2VerificationForPossessionPO verificationForPossessionPO = new IMDb2VerificationForPossessionPO();

//  Movie 3: 'Sorcerer' (1977)

    IMDb3ClickOnSorcererMoviePO clickOnSorcererMoviePO = new IMDb3ClickOnSorcererMoviePO();
    IMDb3VerificationForSorcererPO verificationForSorcererPO = new IMDb3VerificationForSorcererPO();

//  Movie 4: 'Dog Day Afternoon' (1975)

    IMDb4ClickOnDogDayAfternoonMoviePO clickOnDogDayAfternoonMoviePO = new IMDb4ClickOnDogDayAfternoonMoviePO();
    IMDb4VerificationForDogDayAfternoonPO verificationForDogDayAfternoonPO = new IMDb4VerificationForDogDayAfternoonPO();

//  Movie 5: 'Eyes Without A Face' (1960)

    IMDb5ClickOnEyesWithoutAFaceMoviePO clickOnEyesWithoutAFaceMoviePO = new IMDb5ClickOnEyesWithoutAFaceMoviePO();
    IMDb5VerificationForEyesWithoutAFacePO verificationForEyesWithoutAFacePO = new IMDb5VerificationForEyesWithoutAFacePO();

//  Tv Series 1 : 'Death Note' (2006-2007)

    IMDb6ClickOnDeathNoteTvSeriesPO clickOnDeathNoteTvSeriesPO = new IMDb6ClickOnDeathNoteTvSeriesPO();
    IMDb6VerificationForDeathNotePO verificationForDeathNoteTvSeriesPO = new IMDb6VerificationForDeathNotePO();

//  Tv Mini Series 1 : 'Salem's Lot (1979)

    IMDb7ClickOnSalemsLotTvMiniSeriesPO clickOnSalemsLotTvMiniSeriesPO = new IMDb7ClickOnSalemsLotTvMiniSeriesPO();
    IMDb7VerificationForSalemsLotPO verificationForSalemsLotTvMiniSeriesPO = new IMDb7VerificationForSalemsLotPO();

//  Tv Movie 1 : 'Body Bags' (1993)

    IMDb8ClickOnBodyBagsTvMoviePO clickOnBodyBagsTvMoviePO = new IMDb8ClickOnBodyBagsTvMoviePO();
    IMDb8VerificationForBodyBagsPO verificationForBodyBagsTvMoviePO = new IMDb8VerificationForBodyBagsPO();

//  Short Movie 1 : 'The Private Life of a Cat' (1946)

    IMDb9ClickOnThePrivateLifeOfACatShortPO clickOnThePrivateLifeOfACatShortPO = new IMDb9ClickOnThePrivateLifeOfACatShortPO();
    IMDb9VerificationForThePrivateLifeOfACatPO verificationForThePrivateLifeOfACatShortPO = new IMDb9VerificationForThePrivateLifeOfACatPO();

//  Advance Search Result for oscar-winning horror movies

    IMDb10ClickTheFirstResultPO clickTheFirstResultPO = new IMDb10ClickTheFirstResultPO();

    IMDb10VerificationForTheFirstResultPO verificationForTheFirstResultPO = new IMDb10VerificationForTheFirstResultPO();

//-----------------------------------------------------------------------------------------------------------------------------

// Actions

//    UserAction 0 (Press Accept Button for IMDb Cookies)
    public void AcceptButton(){
        userAction0();
    }
    public void userAction0 (){
        this.acceptTermsPO.clickTerms();
    }


//    UserAction 1 (search actions for 'Straw Dogs' movie)
    public void TypeStrawDogsMovie(String typeValueOnSearchBar){

        userAction1(typeValueOnSearchBar);
    }
    public void userAction1 (String typeValueOnSearchBar) {
        this.searchBarPO.typingValueOnSearchBar(typeValueOnSearchBar);
        this.searchBarPO.clickTheSubmitButton();
        this.exactMatchesFilterPO.clickExactMach();
        this.clickOnStrawDogsMoviePO.clickOnStrawDogsMoviePO();
    }

//    UserAction 2 (search actions for 'Possession' movie)
    public void TypePossessionMovie(String typeValueOnSearchBar){

        userAction2(typeValueOnSearchBar);
    }
    public void userAction2 (String typeValueOnSearchBar) {
        this.searchBarPO.typingValueOnSearchBar(typeValueOnSearchBar);
        this.searchBarPO.clickTheSubmitButton();
        this.exactMatchesFilterPO.clickExactMach();
        this.clickOnPossessionMoviePO.clickOnPossessionMoviePO();
    }

//    UserAction 3 (search actions for 'Sorcerer' movie)
    public void TypeSorcererMovie(String typeValueOnSearchBar){

        userAction3(typeValueOnSearchBar);
    }
    public void userAction3 (String typeValueOnSearchBar) {
        this.searchBarPO.typingValueOnSearchBar(typeValueOnSearchBar);
        this.searchBarPO.clickTheSubmitButton();
        this.exactMatchesFilterPO.clickExactMach();
        this.clickOnSorcererMoviePO.clickOnSorcererMoviePO();
    }

//    UserAction 4 (search actions for 'Dog Day Afternoon' movie)
    public void TypeDogDayAfternoonMovie(String typeValueOnSearchBar){

        userAction4(typeValueOnSearchBar);
    }
    public void userAction4 (String typeValueOnSearchBar) {
        this.searchBarPO.typingValueOnSearchBar(typeValueOnSearchBar);
        this.searchBarPO.clickTheSubmitButton();
        this.exactMatchesFilterPO.clickExactMach();
        this.clickOnDogDayAfternoonMoviePO.clickOnDogDayAfternoonMoviePO();
    }

//    UserAction 5 (search actions for 'Eyes Without A Face' movie)
    public void TypeEyesWithoutAFaceMovie(String typeValueOnSearchBar){

         userAction5(typeValueOnSearchBar);
    }
    public void userAction5 (String typeValueOnSearchBar) {
        this.searchBarPO.typingValueOnSearchBar(typeValueOnSearchBar);
        this.searchBarPO.clickTheSubmitButton();
        this.exactMatchesFilterPO.clickExactMach();
        this.clickOnEyesWithoutAFaceMoviePO.clickOnEyesWithoutAFaceMoviePO();
    }

//    UserAction 6 (advanced search action used to trigger every advance search)
    public void AdvanceSearch (String typeValueOnSearchBar){

        userAction6(typeValueOnSearchBar);
    }
    public void userAction6 (String typeValueOnSearchBar){
        this.advanceSearchPO.clickAllButton();
        this.advanceSearchPO.clickAdvanceSearch();
        this.expandAllPO.clickAllButton();
        this.advanceFiltersPO.typeTitleName(typeValueOnSearchBar);
    }
//    userAction 7 & 8 (advanced search action used for Death Note Tv series)

    public void AdvanceSearch1 (String typeValueOnSearchBar){

        userAction7(typeValueOnSearchBar);

    }
    public void userAction7 (String typeValueOnSearchBar){
        this.advanceSearchGetResultsPO.pressTvSeriesButton();
        this.advanceTypeYear1PO.typingValueOnDateBar1(typeValueOnSearchBar);
    }
    public void AdvanceSearch2 (String typeValueOnSearchBar){

        userAction8(typeValueOnSearchBar);

    }
    public void userAction8 (String typeValueOnSearchBar){
        this.advanceTypeYear1PO.typingValueOnDateBar2(typeValueOnSearchBar);
        this.advanceSearchGetResultsPO.pressAnimationButton();
        this.advanceExcludeTikPO.tikDocumetaryBox();
        this.advanceExcludeTikPO.tikShortBox();
        this.advanceSeeResultPO.clickSeeResultsButton();
        this.clickOnDeathNoteTvSeriesPO.clickOnDeathNoteTvSeriesPO();
    }

//    UserAction 9 (advanced search action used for Salem's Lot Tv mini-series)
    public void AdvanceSearch3 (String typeValueOnSearchBar){

        userAction9(typeValueOnSearchBar);

    }
    public void userAction9 (String typeValueOnSearchBar){
        this.advanceSearchGetResultsPO.pressTvMiniSeriesButton();
        this.advanceTypeYear1PO.typingValueOnDateBar2(typeValueOnSearchBar);
        this.advanceSearchGetResultsPO.pressHorrorButton();
        this.advanceExcludeTikPO.tikDocumetaryBox();
        this.advanceExcludeTikPO.tikShortBox();
        this.advanceSeeResultPO.clickSeeResultsButton();
        this.clickOnSalemsLotTvMiniSeriesPO.clickOnSalemsLotTvMiniSeriesPO();
    }

//    UserAction 10 (advanced search action used for Body Bags Tv movie)

    public void AdvanceSearch4 (String typeValueOnSearchBar){

        userAction10(typeValueOnSearchBar);

    }
    public void userAction10 (String typeValueOnSearchBar){
        this.advanceSearchGetResultsPO.pressTvMovieButton();
        this.advanceTypeYear1PO.typingValueOnDateBar2(typeValueOnSearchBar);
        this.advanceSearchGetResultsPO.pressHorrorButton();
        this.advanceExcludeTikPO.tikDocumetaryBox();
        this.advanceExcludeTikPO.tikShortBox();
        this.advanceSeeResultPO.clickSeeResultsButton();
        this.clickOnBodyBagsTvMoviePO.clickOnBodyBagsTvMoviePO();
    }

//    UserAction 11 (advanced search action used for The Private Life Of A Cat short)

    public void AdvanceSearch5 (String typeValueOnSearchBar){

        userAction11(typeValueOnSearchBar);

    }
    public void userAction11 (String typeValueOnSearchBar){
        this.advanceSearchGetResultsPO.pressShortButton();
        this.advanceTypeYear1PO.typingValueOnDateBar2(typeValueOnSearchBar);
        this.advanceSearchGetResultsPO.pressDocumentaryButton();
        this.advanceSeeResultPO.clickSeeResultsButton();
        this.clickOnThePrivateLifeOfACatShortPO.clickOnThePrivateLifeOfACatShortPO();
    }

//    UserAction 12 (advance search for oscar winning horror movies)

    public void AdvanceSearch6 (String typeValueOnSearchBar){

        userAction12(typeValueOnSearchBar);

    }
    public void userAction12 (String typeValueOnSearchBar){
        this.advanceSearchGetResultsPO.pressMovieButton();
        this.advanceTypeRatingsPO.typingValueOnRatingBar1(typeValueOnSearchBar);
        this.advanceSearchGetResultsPO.pressHorrorButton();
        this.advanceExcludeTikPO.tikDocumetaryBox();
        this.advanceExcludeTikPO.tikShortBox();
        this.advanceSearchGetResultsPO.pressOscarWinningButton();
        this.advanceSeeResultPO.clickSeeResultsButton();
        this.clickTheFirstResultPO.clickOnTheFirstResult();
    }

//-----------------------------------------------------------------------------------------------------------------------------

//  Verification Methods.

//  For search 1 (Straw Dogs 1971)

    public void verifyStrawDogsPrimaryText(){

        Assert.assertTrue(verificationForStrawDogsPO.verifyStrawDogsPrimaryText());
    }
    public void verifyStrawDogsYearOfRelease(){

        Assert.assertTrue(verificationForStrawDogsPO.verifyStrawDogsYearOfRelease());
    }

//  For search 2 (Possession 1981)

    public void verifyPossessionPrimaryText(){

    Assert.assertTrue(verificationForPossessionPO.verifyPossessionPrimaryText());
    }
    public void verifyPossessionYearOfRelease(){

        Assert.assertTrue(verificationForPossessionPO.verifyPossessionYearOfRelease());
    }

//  For search 3 (Sorcerer 1977)

    public void verifySorcererPrimaryText(){

    Assert.assertTrue(verificationForSorcererPO.verifySorcererPrimaryText());
    }
    public void verifySorcererYearOfRelease(){

        Assert.assertTrue(verificationForSorcererPO.verifySorcererYearOfRelease());
    }

//  For search 4 (Dog Day Afternoon 1975)

    public void verifyDogDayAfternoonPrimaryText(){

    Assert.assertTrue(verificationForDogDayAfternoonPO.verifyDogDayAfternoonPrimaryText());
    }
    public void verifyDogDayAfternoonYearOfRelease(){

        Assert.assertTrue(verificationForDogDayAfternoonPO.verifyDogDayAfternoonYearOfRelease());
    }

//  For search 5 (Eyes Without A Face 1960)

    public void verifyEyesWithoutAFacePrimaryText(){

    Assert.assertTrue(verificationForEyesWithoutAFacePO.verifyEyesWithoutAFacePrimaryText());
    }
    public void verifyEyesWithoutAFaceYearOfRelease(){

        Assert.assertTrue(verificationForEyesWithoutAFacePO.verifyEyesWithoutAFaceYearOfRelease());
    }

//  For advanced search 1
//  Verify--> Primary Text (Death Note) & Year (2006-2007)

    public void verifyDeathNoteTvSeriesPrimaryText(){

        Assert.assertTrue(verificationForDeathNoteTvSeriesPO.verifyDeathNoteTvSeriesPrimaryText());
    }
    public void verifyDeathNoteTvSeriesYearOfRelease(){

        Assert.assertTrue(verificationForDeathNoteTvSeriesPO.verifyDeathNoteTvSeriesYearOfRelease());
    }

//  For advanced search 2
//  Verify--> Primary Text (Salem's Lot) & Year (1979)

    public void verifySalemsLotTvMiniSeriesPrimaryText(){

        Assert.assertTrue(verificationForSalemsLotTvMiniSeriesPO.verifySalemsLotTvMiniSeriesPrimaryText());
    }
    public void verifySalemsLotTvMiniSeriesYearOfRelease(){

        Assert.assertTrue(verificationForSalemsLotTvMiniSeriesPO.verifySalemsLotTvMiniSeriesYearOfRelease());
    }

//  For advanced search 3
//  Verify--> Primary Text (Body Bags) & Year (1993)

    public void verifyBodyBagsTvMoviePrimaryText(){

        Assert.assertTrue(verificationForBodyBagsTvMoviePO.verifyBodyBagsTvMoviePrimaryText());
    }
    public void verifyBodyBagsTvMovieYearOfRelease(){

        Assert.assertTrue(verificationForBodyBagsTvMoviePO.verifyBodyBagsTvMovieYearOfRelease());
    }

//    For advanced search 4
//    Verify--> Primary Text (The Private Life of a Cat) & Year (1946)

    public void verifyThePrivateLifeOfACatShortPrimaryText(){

        Assert.assertTrue(verificationForThePrivateLifeOfACatShortPO.verifyThePrivateLifeOfACatShortPrimaryText());
    }
    public void verifyThePrivateLifeOfACatShortYearOfRelease(){

        Assert.assertTrue(verificationForThePrivateLifeOfACatShortPO.verifyThePrivateLifeOfACatShortYearOfRelease());
    }
//    For advance search 5
//    Verify--> genre (horror) & Awards (Oscar-Winning)

    public void verifyTheFirstResultGenre(){

        Assert.assertTrue(verificationForThePrivateLifeOfACatShortPO.verifyThePrivateLifeOfACatShortPrimaryText());
    }
    public void verifyTheFirstResultAwards(){

        Assert.assertTrue(verificationForThePrivateLifeOfACatShortPO.verifyThePrivateLifeOfACatShortYearOfRelease());
    }
}