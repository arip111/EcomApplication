package dev.arip.EcomProductService.mapper;

import dev.arip.EcomProductService.dto.ProductResponseDTO;
import dev.arip.EcomProductService.entity.Product;

public class ProductEntityDTOMapper {

    public static ProductResponseDTO convertEntityToDTO(Product product)
    {
        ProductResponseDTO productResponseDTO = new ProductResponseDTO();
        productResponseDTO.setProductId(product.getId());
        productResponseDTO.setTitle(product.getTitle());
        productResponseDTO.setCategory(product.getCategory());
        productResponseDTO.setPrice(product.getPrice());
        productResponseDTO.setDescription(product.getDescription());
        productResponseDTO.setRating(product.getRating());
        productResponseDTO.setImageURL(product.getImageURL());

        return productResponseDTO;
    }
}
