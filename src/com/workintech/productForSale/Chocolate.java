package com.workintech.productForSale;

public class Chocolate extends ProductForSale{

    private double percentCocoa;
    public Chocolate(TypesProduct typesProduct, double price, String description,double amountOfCocoa) {
        super(TypesProduct.CHOCOLATE, price, description);
        this.percentCocoa=amountOfCocoa;
    }

    public double getAmountOfCocoa() {
        return percentCocoa;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "percentCocoa=" + percentCocoa +
                '}';
    }
}
