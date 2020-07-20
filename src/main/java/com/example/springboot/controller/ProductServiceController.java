package com.example.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {
	@RequestMapping(value = "/products")
	@CrossOrigin(origins = "http://localhost:8080")
	public ResponseEntity<Object> getProduct() {
		return null;
		//return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
	}
}
