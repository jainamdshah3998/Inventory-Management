package com.inventory.zyapaar.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Table
@Entity(name = "order")
@Getter
@Setter
public class OrderDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "product_id")
	private String productId;
	@Column(name = "order_id")
	private String orderId;
	@Column(name = "price")
	private String price;
	@Column(name = "quantity")
	private String quantity;
}
