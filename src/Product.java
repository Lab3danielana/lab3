/**
 * Created by Nirox on 6/18/2015.
 */
public class Product {
    private int productId;
    private String category;
    private String description;
    private long price;

    public Product(int productId, String category, String description, long price) {
        this.productId = productId;
        this.category = category;
        this.description = description;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
