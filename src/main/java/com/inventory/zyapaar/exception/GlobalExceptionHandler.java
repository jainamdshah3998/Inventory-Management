package com.inventory.zyapaar.exception;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	ResponseEntity<String> productNotFound(ProductNotFoundException e){
		return new ResponseEntity<>("Product Not Found Please Enter Valid ID",HttpStatus.NOT_FOUND);
	}

	
	@ExceptionHandler(IOException.class)
	ResponseEntity<String> productNotFound(IOException e){
		return new ResponseEntity<>("Invalid Image",HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(InvalidProductException.class)
	ResponseEntity<String> productNotFound(InvalidProductException e){
		return new ResponseEntity<>("Enter Valid product Details",HttpStatus.NOT_FOUND);
	}
}
