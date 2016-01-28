package org.suite.controllers;

import org.suite.domain.Product;
import org.suite.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public List<Product> list() {
        return productService.listAllProducts();
    }

    @RequestMapping("/{id}")
    public Product showProduct(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void saveProduct(Product product){
        productService.saveProduct(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        productService.deleteProduct(id);
    }

    @RequestMapping("/test/{id}")
    public void test(@PathVariable Integer id){
        productService.A(id);
    }
}
