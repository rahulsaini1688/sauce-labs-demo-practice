package searchtutorial.duckduckgo.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class DuckDuckGoSearchPage extends PageObject {

    @FindBy(id = "search_form_input_homepage")
    WebElementFacade searchField;

    @FindBy(id = "search_form_homepage")
    WebElementFacade submitButton;

    public void enterSearchTerm(String keyword) {
        searchField.type(keyword);

    }

    public void submitSearch() {
        submitButton.click();
    }
}
