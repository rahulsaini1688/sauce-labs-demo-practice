package SwagLabsDemo.Cart;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class CartPageObject extends PageObject {

    public static By cartItemsByList = By.cssSelector(".cart_item");
    public List<CartItem> items() {
        return findAll(cartItemsByList).map(
                cart_item -> new CartItem(
                        cart_item.findBy(".inventory_item_name").getText(),
                        cart_item.findBy(".cart_quantity").getText(),
                        cart_item.findBy(".inventory_item_price").getText(),
                        cart_item.findBy(".inventory_item_desc").getText())

        );
    }
}
