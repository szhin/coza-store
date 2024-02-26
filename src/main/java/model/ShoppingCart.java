package model;

public class ShoppingCart {

    private String shoppingCartID;
    private Product product;
    private int quantity;
    private double total;

    public ShoppingCart() {
    }

    public ShoppingCart(String shoppingCartID, Product product, int quantity, double total) {
        this.shoppingCartID = shoppingCartID;
        this.product = product;
        this.quantity = quantity;
        this.total = total;
    }

    public String getShoppingCartID() {
        return shoppingCartID;
    }

    public void setShoppingCartID(String shoppingCartID) {
        this.shoppingCartID = shoppingCartID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "shoppingCartID='" + shoppingCartID + '\'' +
                ", product=" + product +
                ", quantity=" + quantity +
                ", total=" + total +
                '}';
    }
}
