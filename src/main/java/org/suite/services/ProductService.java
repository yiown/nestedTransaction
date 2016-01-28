package org.suite.services;

import org.suite.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

    void A(Integer id);

    void B(Integer id);
}
