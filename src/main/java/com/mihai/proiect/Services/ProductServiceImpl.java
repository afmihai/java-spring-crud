package com.mihai.proiect.Services;

import com.mihai.proiect.DTO.ProductDTO;
import com.mihai.proiect.Model.Product;
import com.mihai.proiect.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
class ProductServiceImpl implements ProductService {

    @Autowired
    private final ProductRepository repository;

    @Autowired
    ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addProduct(ProductDTO prod) {
        Product persisted = new Product(prod.getId(), prod.getName(), prod.getQuantity(), prod.getPrice(), prod.getDescription(), prod.getFk_supplier());
        repository.save(persisted);
    }

    @Override
    public void editProduct(ProductDTO prod) {
        ProductDTO editedDTO = getProductById(prod.getId());

        Product edited = editedDTO.transformBack();
        edited.edit(prod.getName(), prod.getQuantity(), prod.getPrice(), prod.getDescription(), prod.getFk_supplier());
        repository.save(edited);
    }

    @Override
    public List<ProductDTO> listProducts() {
        List<Product> products = new ArrayList<>();
        repository.findAll().forEach(products::add);

        List<ProductDTO> result = new ArrayList<>();
        for (Product product : products) {
            result.add(new ProductDTO(product));
        }

        return result;
    }

    @Override
    public ProductDTO getProductById(int id) {
        Product result = repository.findOne(id);
        return new ProductDTO(result);

    }

    @Override
    public void deleteProduct(int id) {
        repository.delete(id);
    }

    @Override
    public List<ProductDTO> findTop5ByOrderByIdDesc() {
        List<Product> last5prod = new ArrayList<>(repository.findTop5ByOrderByIdDesc());

        List<ProductDTO> result = new ArrayList<>();
        for (Product product : last5prod) {
            result.add(new ProductDTO(product));
        }

        return result;
    }


}
