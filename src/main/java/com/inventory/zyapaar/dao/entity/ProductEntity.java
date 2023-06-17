package com.inventory.zyapaar.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.inventory.zyapaar.dto.ProductDto;

@Table
@Entity(name = "product")
public class ProductEntity {
	
	public ProductEntity(ProductDto productDto) {
		this.categoryId = productDto.getCategoryId();
		this.description = productDto.getDescription(); 
		this.price= productDto.getPrice();
		this.productName= productDto.getProductName();
		this.quantity= productDto.getQuantity();
		this.supplierId= productDto.getSupplierId();
		this.Status=productDto.getStatus();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "product_name")
	private String productName;
	@Column(name = "description")
	private String description;
	@Column(name = "price")
	private String price;
	@Column(name = "quantity")
	private String quantity;
	@Column(name = "categoryId")
	private String categoryId;
	@Column(name = "supplierId")
	private String supplierId;
	@Column(name = "status")
	private String Status;
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
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

}
