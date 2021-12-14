package searchtutorial.duckduckgo.steps;

import net.thucydides.core.annotations.Step;
import searchtutorial.duckduckgo.pageObjects.DuckDuckGoSearchPage;

public class DuckDuckGoSearcher {
    DuckDuckGoSearchPage searchPage;
//    DuckDuckGoResultsPage resultsPage;

    @Step
    public void searches_by_keyword_for(String keyword) {
        searchPage.enterSearchTerm(keyword);
        searchPage.submitSearch();
    }

//    @Step
//    public void should_only_see_results_containing(String expectedTerm) {
//        List<String> results = resultsPage.getDisplayedResults();
//    }
}
