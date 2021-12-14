package SwagLabsDemo.authentication;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractionSteps {

    @Step("Login as a standard user")
    public void asAStandardUser() {
        openUrl("https://www.saucedemo.com/");
        find("[data-test='username']").sendKeys("standard_user");
        find("[data-test='password']").sendKeys("secret_sauce");
        find("[data-test='login-button']").click();
    }
}
