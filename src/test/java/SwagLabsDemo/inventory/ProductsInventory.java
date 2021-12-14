package SwagLabsDemo.inventory;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductsInventory extends PageObject {

    public String getHeadingTitle() {

        return find(".title").getText();
    }

    @Step("Validate the backpack item is present using the image name")
    public void locateBackPackByImageName() {
         $(".inventory_container img[alt='Sauce Labs Backpack'").click();

    }



    public WebElement AddToCartButtonForItemByNameMatching(String itemName) {

       return $(By.xpath("//div[contains(text(),'"+itemName+"')]/ancestor::div[@class='inventory_item']/descendant::button[normalize-space()='Add to cart']"));

    }

    public WebElement shoppingCartBadge() {

        return $(".shopping_cart_badge");

    }
}



