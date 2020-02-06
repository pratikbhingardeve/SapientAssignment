package com.productcatalogue.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Product {
	
	@Id
	@Column(name="id", nullable=false, length=50)
	private String id;
	
	@Column(name="category", nullable=false, length=50)
	private String category;
	@Column(name="name", nullable=false, length=50)
	private String name;
	@Column(name="description", length=200)
	private String description;
	
	@Column(name="brand", length=100)
	private String brand;
	
	@Column(name="size")
	private String size;
	@Column(name="colour")
	private String colour;
	@Column(name="price")
	private Double price;
	@Column(name="qty")
	private Integer qty;
	
	public Product() {
		
	}
	public Product(String id, String category, String name, String description, String size,
			String colour, Double price, Integer qty) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.description = description;
        this.size = size;
        this.colour = colour;
        this.price = price;
        this.qty = qty;
    }
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
}
