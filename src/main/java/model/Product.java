package model;

public class Product {

    private String productID;
    private Category category;
    private ProductDetails productDetails;
    private String image;

    public Product() {
    }

    public Product(String productID, Category category, ProductDetails productDetails, String image) {
        this.productID = productID;
        this.category = category;
        this.productDetails = productDetails;
        this.image = image;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", category=" + category +
                ", productDetails=" + productDetails +
                ", image='" + image + '\'' +
                '}';
    }
}
