package SwagLabsDemo.inventory;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class AddItemToShoppingCart extends UIInteractionSteps {

    ProductsInventory productsInventory;

    @Step("Add item to shopping cart with name as {0}")
    public void byNameMatching(String itemName){


//        Click 'Add To Cart' button respective to that item
    productsInventory.AddToCartButtonForItemByNameMatching(itemName).click();


    }
}
