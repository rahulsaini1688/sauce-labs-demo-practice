package searchtutorial.duckduckgo;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import searchtutorial.duckduckgo.steps.DuckDuckGoSearcher;

@RunWith(SerenityRunner.class)

public class WhenSearchingByKeywordInDuckDuckGo {



    @Steps
    DuckDuckGoSearcher Donald;

    @Test
    public void shouldSeeRelevantSearchResults(){
//        driver.get("https://duckduckgo.com/");
        Donald.searches_by_keyword_for("little ducks");
//        Donald.should_only_see_results_containing("ducks");
    }
}
