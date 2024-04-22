package dev.arip.EcomProductService.service;

import dev.arip.EcomProductService.client.FakeStoreClient;
import dev.arip.EcomProductService.dto.FakeStoreCartResponseDTO;
import dev.arip.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.arip.EcomProductService.entity.Product;
import dev.arip.EcomProductService.exception.CartNotFoundException;
import dev.arip.EcomProductService.exception.ProductIdNotFoundException;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("FakeStoreProductService")
public class FakeStoreProductServiceIMPL implements ProductService{

    @Autowired
    private FakeStoreClient client;
    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        List<FakeStoreProductResponseDTO> products = client.getAllProducts();

        return products;
    }

    @Override
    public FakeStoreProductResponseDTO getProductById(int productId) {
        FakeStoreProductResponseDTO fakeStoreProductResponseDTO = client.getProductById(productId);
        if(fakeStoreProductResponseDTO == null)
        {
            throw new ProductIdNotFoundException("Product Not Found with Id: "+productId);
        }
        return fakeStoreProductResponseDTO;
    }

    @Override
    public List<FakeStoreCartResponseDTO> getCartByUserId(int userId) {
        List<FakeStoreCartResponseDTO> cart = client.getCartByUserId(userId);
        if(userId>20)
        {
            cart=null;
        }
        if(cart == null)
        {
            throw new CartNotFoundException("No Cart Found for User ID: "+userId);
        }
        return cart;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
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
