package model;

public class ProductDetails {

    private String productDetailsID;
    private String productName;
    private double price;
    private String description;
    private int size;
    private String color;
    private int number;

    public ProductDetails() {
    }

    public ProductDetails(String productDetailsID, String productName, double price, String description, int size, String color, int number) {
        this.productDetailsID = productDetailsID;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.size = size;
        this.color = color;
        this.number = number;
    }

    public String getProductDetailsID() {
        return productDetailsID;
    }

    public void setProductDetailsID(String productDetailsID) {
        this.productDetailsID = productDetailsID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "productDetailsID='" + productDetailsID + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
