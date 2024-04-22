package dev.arip.EcomProductService.controller;

import dev.arip.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.arip.EcomProductService.entity.Product;
import dev.arip.EcomProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    @Qualifier("ProductServiceIMPL")
    private ProductService productService;

    @GetMapping("/product")
    public ResponseEntity getAllProducts()
    {
        List<FakeStoreProductResponseDTO> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity getProductById(@PathVariable("id") int productId)
    {
        FakeStoreProductResponseDTO product = productService.getProductById(productId);
        return ResponseEntity.ok(product);
    }

    @PostMapping("/product")
    public ResponseEntity createProduct(@RequestBody Product product)
    {
        Product saveProduct = productService.createProduct(product);
        return ResponseEntity.ok(saveProduct);
    }


}
