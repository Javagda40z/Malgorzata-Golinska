package enumy.zadanie;

public class Product {
    private String name;
    private double price;
    private double weight;
    private ProductType productType;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Product(String name, double price, double weight, ProductType productType) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.productType = productType;
    }
}
