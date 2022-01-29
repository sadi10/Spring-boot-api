package com.example.e_beckend.repository;

import com.example.e_beckend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,Integer> {



}
