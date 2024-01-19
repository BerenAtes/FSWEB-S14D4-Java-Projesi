package com.workintech.productForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale coke=new Coke(TypesProduct.COKE,20,"it refreshes you",2.7);
        ProductForSale bread=new Bread(TypesProduct.BREAD,10,"healthier than others"," bran bread");
        ProductForSale chocolate=new Chocolate(TypesProduct.CHOCOLATE,15,"so delicious",52);
        ProductForSale[] products = new ProductForSale[]{coke,chocolate,bread};
        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            product.showDetails();
        }
    }
}
