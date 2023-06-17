package com.inventory.zyapaar.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.zyapaar.dto.ProductDto;
import com.inventory.zyapaar.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	private final InventoryService inventoryService;
	
	public InventoryController(final InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}
	
	@PostMapping(name = "/product")
	public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto productDto){
		ProductDto product =  inventoryService.addProduct(productDto);
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
	
	@GetMapping(name=  "/product/{id}/{status}")
	public ResponseEntity<ProductDto> updateStatus(@PathVariable Long id,@PathVariable String status){
		ProductDto product  = inventoryService.updateProduct(id,status);
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
	
	@DeleteMapping(name=  "/product/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long id){
		inventoryService.deleteProduct(id);
		return new ResponseEntity<>("Product Deleted",HttpStatus.OK	);
	}
	
	@GetMapping(name=  "/getStock")
	public ResponseEntity<List<ProductDto>> getStock(){
		List<ProductDto> productList  = inventoryService.getStock();
		return new ResponseEntity<>(productList,HttpStatus.OK);
	}
	
}
