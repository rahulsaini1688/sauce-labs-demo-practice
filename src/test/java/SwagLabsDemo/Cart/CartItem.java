package SwagLabsDemo.Cart;

public class CartItem {
    String name;
    String quantity;
    String price;
    String description;


    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public CartItem(String name, String quantity, String price, String description){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;

    }


}
