package com.workintech.productForSale;

public class Coke extends ProductForSale{

    private double pHAsic;
    public Coke(TypesProduct type, double price, String description,double pHAsic) {
        super(TypesProduct.COKE, price, description);
        this.pHAsic=pHAsic;
    }

    public double getpHAsic() {
        return pHAsic;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this  );
    }

    @Override
    public String toString() {
        return "Coke{" +
                "pHAsic=" + pHAsic +
                '}';
    }
}
