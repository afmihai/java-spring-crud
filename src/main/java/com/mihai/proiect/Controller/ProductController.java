package com.mihai.proiect.Controller;

import com.mihai.proiect.DTO.ProductDTO;
import com.mihai.proiect.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService service;

    @Autowired
    ProductController(ProductService service) {
        this.service = service;
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    void create(@RequestBody ProductDTO prod) {
        service.addProduct(prod);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") int id) {
        service.deleteProduct(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<ProductDTO> listProducts() {
        return service.listProducts();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    ProductDTO getProductById(@PathVariable("id") int id) {
        return service.getProductById(id);
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    void editProduct(@RequestBody ProductDTO product) {
        service.editProduct(product);
    }

    @RequestMapping(value = "/last5Prod", method = RequestMethod.GET)
    List<ProductDTO> findTop5ByOrderByIdDesc() {
        return service.findTop5ByOrderByIdDesc();
    }
}