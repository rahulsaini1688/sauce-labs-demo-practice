package SwagLabsDemo;

import SwagLabsDemo.authentication.LoginActions;
import SwagLabsDemo.inventory.ProductsInventory;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class WhenLoggingOnToSwagLabs extends UIInteractionSteps {

    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;

    ProductsInventory productsInventory;

    @Test
    public void userCanLoginViaHomePage(){

        login.asAStandardUser();

        assertThat(productsInventory.getHeadingTitle()).isEqualToIgnoringCase("Products");
//        Verify that image name is 'Sauce Labs Backpack' for the backpack item in the inventory list
        productsInventory.locateBackPackByImageName();
    }
}
