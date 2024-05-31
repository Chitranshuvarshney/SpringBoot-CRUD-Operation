package com.example.crud_operation.repository;

import com.example.crud_operation.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
