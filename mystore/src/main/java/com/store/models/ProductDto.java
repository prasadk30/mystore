package com.store.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ProductDto {
	@NotEmpty(message = "The Name is required")
	private String name;
	
	@NotEmpty(message = "The Brand is required")
	private String brand;
	
	@NotEmpty(message = "The Category is required")
	private String category;
	
	@Min(0)
	private double price;
	
	@Size(min = 10, message = "The description should be at least 10 characters")
	@Size(max = 2000, message = "The description cannot exceed 2000 characters")
	private String description;
	
	
	private MultipartFile imageFile;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public MultipartFile getImageFile() {
		return imageFile;
	}


	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}


	@Override
	public String toString() {
		return "ProductDto [name=" + name + ", brand=" + brand + ", category=" + category + ", price=" + price
				+ ", description=" + description + ", imageFile=" + imageFile + ", getName()=" + getName()
				+ ", getBrand()=" + getBrand() + ", getCategory()=" + getCategory() + ", getPrice()=" + getPrice()
				+ ", getDescription()=" + getDescription() + ", getImageFile()=" + getImageFile() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public ProductDto(@NotEmpty(message = "The Name is required") String name,
			@NotEmpty(message = "The Brand is required") String brand,
			@NotEmpty(message = "The Category is required") String category, @Min(0) double price,
			@Size(min = 10, message = "The description should be at least 10 characters") @Size(max = 2000, message = "The description cannot exceed 2000 characters") String description,
			MultipartFile imageFile) {
		super();
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.description = description;
		this.imageFile = imageFile;
	}


	public ProductDto() {
		super();
		
	}
	
	
}
