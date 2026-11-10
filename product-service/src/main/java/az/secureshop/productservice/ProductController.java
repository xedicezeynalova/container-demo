package az.secureshop.productservice;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class ProductController {

    @GetMapping("/products/{id}")
    public Map<String, Object> getProduct(@PathVariable Long id) {
        return Map.of("id", id, "name", "Telefon", "price", 1500);
    }
