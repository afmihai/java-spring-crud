package com.mihai.proiect.DTO;

import com.mihai.proiect.Model.Product;
import com.mihai.proiect.Model.Supplier;

public class ProductDTO {

    private int id;
    private String name;
    private int quantity;
    private int price;
    private String description;
    private int fk_supplier;

    public ProductDTO() {
        //REST Constructor
    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.quantity = product.getQuantity();
        this.price = product.getPrice();
        this.description = product.getDescription();
        this.fk_supplier = product.getFk_supplier();
    }

    public Product transformBack() {

        Product product = new Product();
        product.setId(this.id);
        product.setName(this.name);
        product.setQuantity(this.quantity);
        product.setPrice(this.price);
        product.setDescription(this.description);
        product.setFk_supplier(this.fk_supplier);

        return product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFk_supplier() {
        return fk_supplier;
    }

    public void setFk_supplier(int fk_supplier) {
        this.fk_supplier = fk_supplier;
    }
}
