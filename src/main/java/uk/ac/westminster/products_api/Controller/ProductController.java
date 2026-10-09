package uk.ac.westminster.products_api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import uk.ac.westminster.products_api.Dto.Product;

public class ProductController {
    @GetMapping(value = "/{id}")
    public String getProductById(@PathVariable("id") Integer id  ) {
        return new Product(id, "Product 1", 100.00).toString();
    }
   @PostMapping("/products")
    public String addProduct(@RequestBody Product product) {
   //eturn Product;
return "Product Added";    }
}
