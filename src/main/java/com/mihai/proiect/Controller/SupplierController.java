package com.mihai.proiect.Controller;

import com.mihai.proiect.DTO.SupplierDTO;
import com.mihai.proiect.Services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    private SupplierService service;

    @Autowired
    SupplierController(SupplierService service) {
        this.service = service;
    }

    @RequestMapping(value = "/addSupplier", method = RequestMethod.POST)
    void create(@RequestBody SupplierDTO supplier) {
        service.addSupplier(supplier);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") int id) {
        service.deleteSupplier(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<SupplierDTO> listSuppliers() {
        return service.listSuppliers();
    }

    @RequestMapping(value = "/{supplierID}", method = RequestMethod.GET)
    SupplierDTO getSupplierById(@PathVariable("supplierID") int id) {
        return service.getSupplierById(id);
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    void editSupplier(@PathVariable int id, @RequestBody SupplierDTO supplier) {
        service.editSupplier(supplier);
    }

    @RequestMapping(value = "/last5Supp", method = RequestMethod.GET)
    List<SupplierDTO> findTop5ByOrderByIdDesc() {
        return service.findTop5ByOrderByIdDesc();
    }
}