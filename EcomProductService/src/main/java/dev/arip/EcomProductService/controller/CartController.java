package dev.arip.EcomProductService.controller;

import dev.arip.EcomProductService.dto.FakeStoreCartResponseDTO;
import dev.arip.EcomProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private ProductService productService;

    @GetMapping("/cart/{userId}")
    public ResponseEntity getCartForUser(@PathVariable("userId") int userId)
    {
        List<FakeStoreCartResponseDTO> cart = productService.getCartByUserId(userId);
        return ResponseEntity.ok(cart);
    }
}
