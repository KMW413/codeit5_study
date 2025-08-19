package com.codeit.practice1.model;

// art + ins

public class Product {
    private String pName;
    private int price;
    private String brand;

    public Product() {
        this.pName = "name";
        this.price = 1;
        this.brand = "brand";
    }

    public String getpName() {
        return pName;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("pName='").append(pName).append('\'');
        sb.append(", price=").append(price);
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
