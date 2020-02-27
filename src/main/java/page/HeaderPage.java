package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

@DefaultUrl("http://qa2.dev.evozon.com/customer/account/")
public class HeaderPage extends AbstractPage{

    @FindBy(css="p.welcome-msg")
    private WebElementFacade greetMessage;

    @FindBy(css = "head > title")
    private WebElementFacade actualSiteTitle;

    @FindBy(className = "logo")
    private WebElementFacade logo;

    @FindBy(css = ".skip-link.skip-account")
    private WebElementFacade headerAccount;

    @FindBy(css = "#select-language > option")
    private List<WebElementFacade> headerLanguage;

    @FindBy(id = "select-language")
    private WebElementFacade headerLanguageDropdown;

    @FindBy(id = "search")
    private WebElementFacade search;

    @FindBy(css = ".search-button")
    private WebElementFacade searchButton;

    @FindBy(css = ".page-title")
    private WebElementFacade actualTitleForAProductSearchResult;




    public String getGreetMessage(){
        return greetMessage.getText();
    }

    public String getActualSiteTitle() {
        return getDriver().getTitle();

    }

    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    public boolean getLogo() {
        return logo.isDisplayed();
    }

    public boolean getAccount() {
        return headerAccount.isDisplayed();
    }

    public String getAccountText() {
        return headerAccount.getText();
    }

    public void clickAccount() {
        headerAccount.click();
    }

    public int getLanguageListSize() {
        return headerLanguage.size();
    }

    public void changeLanguage() {
        headerLanguageDropdown.selectByVisibleText("French");
    }

    public void typeInSearch(String searchWord) {
        search.clear();
        search.type(searchWord);
        search.submit();
    }

    public String getActualTitle() {
        return actualTitleForAProductSearchResult.getText().toLowerCase();
    }







}
