package com.kodlamaio.inventoryservice.repository;

import com.kodlamaio.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {


}
