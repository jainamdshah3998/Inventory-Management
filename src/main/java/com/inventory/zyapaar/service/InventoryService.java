package com.inventory.zyapaar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.inventory.zyapaar.dao.entity.ProductEntity;
import com.inventory.zyapaar.dao.repository.ProductRepository;
import com.inventory.zyapaar.dto.ProductDto;
import com.inventory.zyapaar.exception.InvalidProductException;
import com.inventory.zyapaar.exception.ProductNotFoundException;


@Service
public class InventoryService {

	private final ProductRepository productRepository;
	
	public InventoryService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@SuppressWarnings("deprecation")
	public ProductDto addProduct(ProductDto productDto) {
		if(StringUtils.isEmpty(productDto.getProductName()) || StringUtils.isEmpty(productDto.getQuantity()) || StringUtils.isEmpty(productDto.getPrice())){
			throw new InvalidProductException();
		}
		ProductEntity productEntity = new ProductEntity(productDto);
		ProductEntity savedProduct = productRepository.save(productEntity);
		return  new ProductDto(savedProduct);
	}

	public ProductDto updateProduct(Long id, String status) {
		ProductEntity productEntity = productRepository.getReferenceById(id);
		if(productEntity == null) {
			throw new ProductNotFoundException();
		}
		productEntity.setStatus(status);
		ProductEntity updatedProductEntity  = productRepository.save(productEntity);
		return new ProductDto(updatedProductEntity);
	}

	public void deleteProduct(Long id) {
		ProductEntity productEntity = productRepository.getReferenceById(id);
		if(productEntity == null) {
			throw new ProductNotFoundException();
		}
		productRepository.deleteById(id);
	}

	public List<ProductDto> getStock() {
		List<ProductEntity> listOfProducts = productRepository.findAll();
		List<ProductDto> productListDto = new ArrayList<>();
		for(ProductEntity entity :listOfProducts) {
			ProductDto productDto = new ProductDto(entity);
			productListDto.add(productDto);
		}
		return productListDto;
	}

}
