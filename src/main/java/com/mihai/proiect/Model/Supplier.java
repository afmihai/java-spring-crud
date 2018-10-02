package com.mihai.proiect.Model;

import javax.persistence.*;

@Entity
@Table(name = "SUPPLIER")
public class Supplier {


    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ADDRESS")
    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Supplier(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Supplier() {
    }

    public void edit(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
