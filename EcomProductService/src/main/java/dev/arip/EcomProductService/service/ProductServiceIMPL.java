package dev.arip.EcomProductService.service;

import dev.arip.EcomProductService.dto.FakeStoreCartResponseDTO;
import dev.arip.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.arip.EcomProductService.entity.Product;
import dev.arip.EcomProductService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductServiceIMPL")
public class ProductServiceIMPL implements ProductService{

    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        return null;
    }

    @Override
    public FakeStoreProductResponseDTO getProductById(int productId) {
        return null;
    }

    @Override
    public List<FakeStoreCartResponseDTO> getCartByUserId(int userId) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        Product saveProduct = productRepository.save(product);
        return saveProduct;
    }

    @Override
    public Product updateProduct(Product updatedProduct, int productId) {
        return null;
    }

    @Override
    public boolean deleteProduct(int productId) {
        return false;
    }
}
