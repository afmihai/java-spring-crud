package com.mihai.proiect.Repositories;

import com.mihai.proiect.Model.Product;
import com.mihai.proiect.Model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findTop5ByOrderByIdDesc();
}

