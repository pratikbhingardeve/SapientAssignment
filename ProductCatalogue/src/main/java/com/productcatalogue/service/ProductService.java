package com.productcatalogue.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalogue.dto.Product;
import com.productcatalogue.persistence.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
    private ProductRepository productRepository;
	
    public List<Product> getAllProducts() {
        List<Product> allProducts = new ArrayList<>();
        productRepository.findAll().forEach(allProducts::add);
        return allProducts;
    }
    
    public Product getProduct(String id) {
        return productRepository.findById(id).orElseGet(Product::new);
    }

    public void addProduct(Product product) {
    	productRepository.save(product);
    }

    public void updateProduct(String id, Product product) {
    	productRepository.save(product);
    }

    public void deleteProduct(String id) {
    	productRepository.deleteById(id);
    }
    
    public List<Product> getProductByBrand(String brand) {
    	List<Product> brandProducts = new ArrayList<>();
    	productRepository.findAll().forEach((prod)->{
    		if(brand.equalsIgnoreCase(prod.getBrand()))
    			brandProducts.add(prod);
    	});
    	return brandProducts;
    }
    
    public List<Product> getProductByPriceAsc() {
    	List<Product> allProducts = new ArrayList<>();
    	productRepository.findAll().forEach(allProducts::add);
    	allProducts.sort(Comparator.comparing(e -> e.getPrice()));
    	return allProducts;
    }
    
    public List<Product> getProductByPriceDesc() {
    	List<Product> allProducts = new ArrayList<>();
    	productRepository.findAll().forEach(allProducts::add);
    	
    	Comparator<Product> compareByPriceDesc = (Product o1, Product o2) ->
        o2.getPrice().compareTo( o1.getPrice() );
        
    	allProducts.sort(compareByPriceDesc);
    	return allProducts;
    }
    
    public List<Product> getProductByColor(String color) {
    	List<Product> colorProducts = new ArrayList<>();
    	productRepository.findAll().forEach((prod)->{
    		if(color.equalsIgnoreCase(prod.getColour()))
    			colorProducts.add(prod);
    	});
    	return colorProducts;
    }
    
    public List<Product> getProductBySize(String size) {
    	List<Product> sizeProducts = new ArrayList<>();
    	productRepository.findAll().forEach((prod)->{
    		if(size.equalsIgnoreCase(prod.getSize()))
    			sizeProducts.add(prod);
    	});
    	return sizeProducts;
    }
    
    public List<Product> getProductByCategory(String category) {
    	List<Product> categoryProducts = new ArrayList<>();
    	productRepository.findAll().forEach((prod)->{
    		if(category.equalsIgnoreCase(prod.getCategory()))
    			categoryProducts.add(prod);
    	});
    	return categoryProducts;
    }
}
