package com.mihai.proiect.DTO;

import com.mihai.proiect.Model.Supplier;

public class SupplierDTO {
    
    private int id;
    private String name;
    private String address;
    
    public SupplierDTO() {
        //REST Constructor
    }
    
    public SupplierDTO(Supplier supplier) {
        this.id = supplier.getId();
        this.name= supplier.getName();
        this.address = supplier.getAddress();
    }
    
    public Supplier transformBack() {
        Supplier supplier = new Supplier();
        supplier.setId(this.id);
        supplier.setName(this.name);
        supplier.setAddress(this.address);
        
        return supplier;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
