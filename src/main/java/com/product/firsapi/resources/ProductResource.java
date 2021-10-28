package com.product.firsapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.firsapi.models.Product;
import com.product.firsapi.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/api")
public class ProductResource {

	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> listProducts(){
		return productRepository.findAll();
	}

}
