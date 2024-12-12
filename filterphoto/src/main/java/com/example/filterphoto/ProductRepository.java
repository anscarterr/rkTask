package com.example.filterphoto;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findByImageUrlIsNotNull();
}
