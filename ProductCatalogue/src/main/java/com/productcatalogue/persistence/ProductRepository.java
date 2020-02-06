package com.productcatalogue.persistence;

import com.productcatalogue.dto.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {

	
}
