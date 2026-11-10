package com.example.order_service;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;
import java.util.Map;

@RestController
public class OrderController {

    private final RestClient client = RestClient.create();

    @GetMapping("/orders/{id}")
    public Map<String, Object> getOrder(@PathVariable Long id) {
        Object product;
        try {
            product = client.get()
                    .uri("http://product-service:8081/products/" + id)
                    .retrieve()
                    .body(Map.class);
        } catch (Exception e) {
            product = "Məhsul servisi müvəqqəti əlçatmazdır";
        }
        return Map.of("orderId", id, "product", product);
    }
}