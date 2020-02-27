package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.HeaderPage;

import java.time.Duration;

public class HeaderStep extends ScenarioSteps {

    HeaderPage headerPage;

    @Step
    public void verifySiteTitle(String expectedTitle) {
//        headerPage.getActualSiteTitle();
       // Assert.assertEquals(expectedTitle, headerPage.getActualSiteTitle());
        Assert.assertTrue(headerPage.getActualSiteTitle().contentEquals(expectedTitle));
    }

    @Step
    public void verifyCurrentUrl(String expectedUrl) {
        Assert.assertEquals(headerPage.getCurrentUrl(), expectedUrl);
    }

    @Step
    public void verifyIfLogoIsPresent(){
        Assert.assertTrue(headerPage.getLogo());
    }

    @Step
    public void verifyIfHeaderAccountIsPresent() {
        Assert.assertTrue(headerPage.getAccount());
    }

    @Step
    public void verifyAccountText(String actualAccountText) {
        Assert.assertEquals(headerPage.getAccountText(), actualAccountText);
    }

    @Step
    public void clickOnAccount(){
        headerPage.clickAccount();
    }

    @Step
    public void verifyListLanguageSize(int expected) {
        Assert.assertEquals(headerPage.getLanguageListSize(), expected);
    }

    @Step
    public void verifyIfAnotherLanguageIsSelected() {
       headerPage.changeLanguage();
}

    @Step
    public void verifySearchedTermIs (String searchWord) {

        headerPage.typeInSearch(searchWord);

    }

}
