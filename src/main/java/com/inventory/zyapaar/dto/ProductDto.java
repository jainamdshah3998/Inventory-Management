package com.inventory.zyapaar.dto;

import com.inventory.zyapaar.dao.entity.ProductEntity;

public class ProductDto {
	private long id;
	private String productName;
	private String description;
	private String price;
	private String quantity;
	private String categoryId;
	private String supplierId;
	private String status;
	
	public ProductDto(ProductEntity product) {
		this.categoryId = product.getCategoryId();
		this.description = product.getDescription(); 
		this.price= product.getPrice();
		this.productName= product.getProductName();
		this.quantity= product.getQuantity();
		this.supplierId= product.getSupplierId();
		this.status=product.getStatus();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
