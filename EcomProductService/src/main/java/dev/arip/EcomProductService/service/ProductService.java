package dev.arip.EcomProductService.service;

import dev.arip.EcomProductService.dto.FakeStoreCartResponseDTO;
import dev.arip.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.arip.EcomProductService.entity.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public interface ProductService {

    List<FakeStoreProductResponseDTO> getAllProducts();
    FakeStoreProductResponseDTO getProductById(int productId);

    List<FakeStoreCartResponseDTO> getCartByUserId(int userId);
    Product createProduct(Product product);
    Product updateProduct(Product updatedProduct, int productId);
    boolean deleteProduct(int productId);
}
