package com.workintech.productForSale;

public abstract class ProductForSale {
    private TypesProduct type;
    private double price;
    private String description;

    public ProductForSale(TypesProduct type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public TypesProduct getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getSalesPrice(int quantity){
        return quantity*price;
    }

    public abstract void showDetails();


    @Override
    public String toString() {
        return "ProductForSale{" +
                "type=" + type +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
