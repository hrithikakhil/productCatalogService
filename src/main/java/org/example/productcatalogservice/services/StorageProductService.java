package org.example.productcatalogservice.services;

import org.example.productcatalogservice.models.Product;
import org.example.productcatalogservice.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class StorageProductService implements IProductService{

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product getProductById(Long id) {

        Optional<Product> optionalProduct = productRepo.findById(id);

        if(optionalProduct.isPresent()){
            return optionalProduct.get();
        }

        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product replaceProduct(Product product, Long id) {
        return null;
    }
}
