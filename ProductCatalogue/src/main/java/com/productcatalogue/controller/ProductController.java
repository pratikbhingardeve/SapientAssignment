package com.productcatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalogue.dto.Product;
import com.productcatalogue.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable String productId){
        return productService.getProduct(productId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
    	productService.addProduct(product);
    }

    @PutMapping("/products/{id}")
    public void updateProduct(@PathVariable String productId, @RequestBody Product product) {
    	productService.updateProduct(productId, product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable String productId) {
    	productService.deleteProduct(productId);
    }
    
    @GetMapping("/products/brand/{brand}")
    public List<Product> getProductsByBrand(@PathVariable String brand){
        return productService.getProductByBrand(brand);
    }
    
    @GetMapping("/products/price/asc")
    public List<Product> getProductsByPriceAsc(){
        return productService.getProductByPriceAsc();
    }
    
    @GetMapping("/products/price/desc")
    public List<Product> getProductsByPriceDesc(){
        return productService.getProductByPriceDesc();
    }
    
    @GetMapping("/products/color/{color}")
    public List<Product> getProductsByColor(@PathVariable String color){
        return productService.getProductByColor(color);
    }
    
    @GetMapping("/products/size/{size}")
    public List<Product> getProductsBySize(@PathVariable String size){
        return productService.getProductBySize(size);
    }
    
    @GetMapping("/products/category/{category}")
    public List<Product> getProductsByCategory(@PathVariable String category){
        return productService.getProductByCategory(category);
    }
    
}