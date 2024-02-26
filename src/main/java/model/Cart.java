package model;

import java.util.ArrayList;

public class Cart {

    private String cartID;
    private User user;
    private ArrayList<ShoppingCart> listShoppingCart;

    public Cart(String cartID, User user, ArrayList<ShoppingCart> listShoppingCart) {
        this.cartID = cartID;
        this.user = user;
        this.listShoppingCart = listShoppingCart;
    }

    public Cart() {
    }

    public String getCartID() {
        return cartID;
    }

    public void setCartID(String cartID) {
        this.cartID = cartID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<ShoppingCart> getListShoppingCart() {
        return listShoppingCart;
    }

    public void setListShoppingCart(ArrayList<ShoppingCart> listShoppingCart) {
        this.listShoppingCart = listShoppingCart;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartID='" + cartID + '\'' +
                ", user=" + user +
                ", listShoppingCart=" + listShoppingCart +
                '}';
    }
}
