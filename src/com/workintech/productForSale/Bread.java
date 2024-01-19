package com.workintech.productForSale;

public class Bread extends ProductForSale{

    private String typeOfBread;

    public Bread(TypesProduct type, double price, String description, String typeOfBread) {
        super(TypesProduct.BREAD, price, description);
        this.typeOfBread = typeOfBread;
    }

    public String getTypeOfBread() {
        return typeOfBread;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "typeOfBread='" + typeOfBread + '\'' +
                '}';
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);

    }

}
