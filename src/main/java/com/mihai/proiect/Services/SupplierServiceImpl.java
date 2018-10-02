package com.mihai.proiect.Services;

import com.mihai.proiect.DTO.SupplierDTO;
import com.mihai.proiect.Model.Supplier;
import com.mihai.proiect.Repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
class SupplierServiceImpl implements SupplierService {

    @Autowired
    private final SupplierRepository repository;

    @Autowired
    SupplierServiceImpl(SupplierRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addSupplier(SupplierDTO supp) {
        Supplier persisted = new Supplier(supp.getId(), supp.getName(), supp.getAddress());
        repository.save(persisted);
    }

    @Override
    public void editSupplier(SupplierDTO supp) {
        SupplierDTO editedDTO = getSupplierById(supp.getId());

        Supplier edited = editedDTO.transformBack();
        edited.edit(supp.getName(), supp.getAddress());
        repository.save(edited);
    }

    @Override
    public List<SupplierDTO> listSuppliers() {
        List<Supplier> products = new ArrayList<>();
        repository.findAll().forEach(products::add);

        List<SupplierDTO> result = new ArrayList<>();
        for (Supplier supplier : products) {
            result.add(new SupplierDTO(supplier));
        }

        return result;
    }

    @Override
    public SupplierDTO getSupplierById(int id) {
        Supplier result = repository.findOne(id);
        return new SupplierDTO(result);

    }

    @Override
    public void deleteSupplier(int id) {
        repository.delete(id);
    }

    @Override
    public List<SupplierDTO> findTop5ByOrderByIdDesc() {
        List<Supplier> last5supp = new ArrayList<>(repository.findTop5ByOrderByIdDesc());

        List<SupplierDTO> result = new ArrayList<>();
        for(Supplier supplier : last5supp) {
            result.add(new SupplierDTO(supplier));
        }

        return result;
    }
}
