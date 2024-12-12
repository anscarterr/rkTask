package com.example.filterphoto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductWithImages(){
        return productRepository.findByImageUrlIsNotNull();
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
