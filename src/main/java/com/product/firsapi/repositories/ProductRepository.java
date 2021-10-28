package com.product.firsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.firsapi.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
