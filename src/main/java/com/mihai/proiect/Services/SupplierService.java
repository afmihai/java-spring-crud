package com.mihai.proiect.Services;

import com.mihai.proiect.DTO.SupplierDTO;

import java.util.List;

public interface SupplierService {
    void addSupplier(SupplierDTO supp);

    void editSupplier(SupplierDTO supp);

    List<SupplierDTO> listSuppliers();

    SupplierDTO getSupplierById(int id);

    void deleteSupplier(int id);

    List<SupplierDTO> findTop5ByOrderByIdDesc();
}
