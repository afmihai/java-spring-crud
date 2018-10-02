package com.mihai.proiect.Services;

import com.mihai.proiect.DTO.ProductDTO;

import java.util.List;

public interface ProductService {
    void addProduct(ProductDTO prod);

    void editProduct(ProductDTO prod);

    List<ProductDTO> listProducts();

    ProductDTO getProductById(int id);

    void deleteProduct(int id);

    List<ProductDTO> findTop5ByOrderByIdDesc();
}
