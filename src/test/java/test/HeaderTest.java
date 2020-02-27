package test;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.HeaderStep;

@RunWith(SerenityRunner.class)

public class HeaderTest extends BaseTest {

    @Steps
    HeaderStep headerStep;

    @Test
    public void testTitle() {
        headerStep.verifySiteTitle("Madison Island");
    }

    @Test
    public void testUrl(){
        headerStep.verifyCurrentUrl("http://qa2.dev.evozon.com/");
    }

    @Test
    public void testIfLogoIsPresent(){
        headerStep.verifyIfLogoIsPresent();
    }

    @Test
    public void testIfHeaderAccountIsPresent() {
        headerStep.verifyIfHeaderAccountIsPresent();
    }

    @Test
    public void testIfAccountTextIsTheSame() {
        headerStep.verifyAccountText("ACCOUNT");
    }

    @Test
    public void testIfAccountIsClicked() {
        headerStep.clickOnAccount();
    }

    @Test
    public void testListSize() {
        headerStep.verifyListLanguageSize(3);
    }

    @Test
    public void testSelectAnotherLanguage() {
        headerStep.verifyIfAnotherLanguageIsSelected();
    }

    @Test
    public void testSearchItem() {
        headerStep.verifySearchedTermIs("woman");
    }

}
