package com.example.product_service;


import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class ProductController {

    @GetMapping("/products/{id}")
    public Map<String, Object> getProduct(@PathVariable Long id) {
        return Map.of("id", id, "name", "Noutbuk", "price", 1500);
    }
}
