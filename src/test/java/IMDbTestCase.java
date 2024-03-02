import business.objects.IMDbBO.IMDbUserActionBO;
import common.BaseActions;
import common.TestBase;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Epic("Allure Epic")
@Feature("Feature 1")
@Story("Story 1 of Feature 1")
public class IMDbTestCase extends TestBase {
//    BaseActions baseActions;
    IMDbUserActionBO userActionBO;

    @BeforeClass(alwaysRun = true)
    public void initEnv() {

//        baseActions = new BaseActions();
        userActionBO = new IMDbUserActionBO();
    }

//Test Step 1

    @Step
    @Link(url = "https://www.imdb.com/")
    @Test(alwaysRun = true, description = "IMDb test 1 (home search examples)")
    public void test_step1() {
        userActionBO.AcceptButton();

        userActionBO.TypeStrawDogsMovie("straw dogs 1971");
        userActionBO.verifyStrawDogsPrimaryText();
        userActionBO.verifyStrawDogsYearOfRelease();

        userActionBO.TypePossessionMovie("possession 1981");
        userActionBO.verifyPossessionPrimaryText();
        userActionBO.verifyPossessionYearOfRelease();

        userActionBO.TypeSorcererMovie("sorcerer 1977");
        userActionBO.verifySorcererPrimaryText();
        userActionBO.verifySorcererYearOfRelease();

        userActionBO.TypeDogDayAfternoonMovie("dog day afternoon 1975");
        userActionBO.verifyDogDayAfternoonPrimaryText();
        userActionBO.verifyDogDayAfternoonYearOfRelease();

        userActionBO.TypeEyesWithoutAFaceMovie("eyes without a face 1960");
        userActionBO.verifyEyesWithoutAFacePrimaryText();
        userActionBO.verifyEyesWithoutAFaceYearOfRelease();
    }

//Test Step 2

    @Step
    @Link(url = "https://www.imdb.com/")
    @Test(alwaysRun = true, description = "IMDb test 2 (advance search examples)")
    public void test_step2(){
        userActionBO.AdvanceSearch("death note");
        userActionBO.AdvanceSearch1("2006");
        userActionBO.AdvanceSearch2("2007");
        userActionBO.verifyDeathNoteTvSeriesPrimaryText();
        userActionBO.verifyDeathNoteTvSeriesYearOfRelease();

        userActionBO.AdvanceSearch("salems lot");
        userActionBO.AdvanceSearch3("1979");
        userActionBO.verifySalemsLotTvMiniSeriesPrimaryText();
        userActionBO.verifySalemsLotTvMiniSeriesYearOfRelease();

        userActionBO.AdvanceSearch("body bags");
        userActionBO.AdvanceSearch4("1993");
        userActionBO.verifyBodyBagsTvMoviePrimaryText();
        userActionBO.verifyBodyBagsTvMovieYearOfRelease();

        userActionBO.AdvanceSearch("the private life of a cat");
        userActionBO.AdvanceSearch5("1946");
        userActionBO.verifyThePrivateLifeOfACatShortPrimaryText();
        userActionBO.verifyThePrivateLifeOfACatShortYearOfRelease();

        userActionBO.AdvanceSearch("");
        userActionBO.AdvanceSearch6("8");
        userActionBO.verifyTheFirstResultGenre();
        userActionBO.verifyTheFirstResultAwards();
    }
}
