package com.mihai.proiect.Repositories;

import com.mihai.proiect.Model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Integer> {

    List<Supplier> findTop5ByOrderByIdDesc();

}

