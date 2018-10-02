package com.mihai.proiect.Model;



import javax.persistence.*;


@Entity
@Table(name="PRODUCT")
public class Product {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name="NAME")
    private String name;
    @Column(name="QUANTITY")
    private int quantity;
    @Column(name="PRICE")
    private int price;
    @Column(name="DESCRIPTION")
    private String description;
    @Column(name="FK_SUPPLIER")
    private int fk_supplier;

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

    public Product() {
    }

    public int getFk_supplier() {
        return fk_supplier;

    }

    public void setFk_supplier(int fk_supplier) {
        this.fk_supplier = fk_supplier;
    }

    public Product(int id, String name, int quantity, int price, String description, int fk_supplier) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.fk_supplier = fk_supplier;
    }

    public void edit(String name, int quantity, int price, String description, int fk_supplier) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.fk_supplier = fk_supplier;
    }

}
