package SwagLabsDemo;


import SwagLabsDemo.Cart.CartPageObject;
import SwagLabsDemo.authentication.LoginActions;
import SwagLabsDemo.inventory.AddItemToShoppingCart;
import SwagLabsDemo.inventory.ProductsInventory;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class WhenAddingItemsToShoppingCart {

    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;

    @Steps
    AddItemToShoppingCart addItemToShoppingCart;

    ProductsInventory productsInventory;
    CartPageObject cart;

    @Before
    public void login(){
        login.asAStandardUser();
    }

    @Test
    public void verifyCorrectNumberOfItemsDisplayedOnShoppingCartCounter(){

//        login as standard user
//        Add x random items from the inventory to the shopping cart
//        verify the Shopping cart counter displays x


        addItemToShoppingCart.byNameMatching("Backpack");
        addItemToShoppingCart.byNameMatching("Bolt T-Shirt");

        Serenity.reportThat("Validate that shopping cart counter is displaying 2 items", () ->
        assertThat(productsInventory.shoppingCartBadge().getText()).isEqualToIgnoringCase("2"));
    }
    
    @Test
    public void verifyItemsAreAddedIntoTheShoppingCart(){

//       Given user logs in and adds items to shopping cart
        String element1 = "Sauce Labs Backpack";
        String element2 = "Sauce Labs Bolt T-Shirt";
        List<String> expectedItems = Arrays.asList(element1, element2);
        expectedItems.forEach(
                item -> addItemToShoppingCart.byNameMatching(item)
        );


//  when user is reviewing shopping cart
        Serenity.reportThat("Cart is opened", () -> cart.open() )
        ;
////   Then     x and y should be visible on reviewing shoppping cart
        cart.items().forEach(
                cartItem -> assertThat(cartItem.getName()).isIn(expectedItems));
// TBC - Find element inside another list but matching one is okay not exact match

    }

}
