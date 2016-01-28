package org.suite.services;

import org.suite.domain.Product;
import org.suite.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> listAllProducts() {
        return (List<Product>)productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.delete(id);
    }

    @Override
    public void A(Integer id) {
        B(id);
    }

    @Override
    @Transactional
    public void B(Integer id) {
        Product product = productRepository.findOne(id);
        productRepository.save(product);
    }
}
