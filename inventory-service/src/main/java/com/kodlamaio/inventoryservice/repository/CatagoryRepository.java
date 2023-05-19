package com.kodlamaio.inventoryservice.repository;

import com.kodlamaio.inventoryservice.entities.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatagoryRepository extends JpaRepository<Catagory,Integer> {
}
