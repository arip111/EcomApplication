package dev.arip.EcomProductService.client;

import dev.arip.EcomProductService.dto.FakeStoreCartResponseDTO;
import dev.arip.EcomProductService.dto.FakeStoreProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Component
public class FakeStoreClient {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fakestore.api.base.url}")
    private String fakeStoreApiBaseURL;
    @Value("${fakestore.api.product.path}")
    private String fakeStoreApiProductPath;
    @Value("${fakestore.api.cart.path}")
    private String fakeStoreCartPath;


    public List<FakeStoreProductResponseDTO> getAllProducts()
    {
        String baseUrl = fakeStoreApiBaseURL.concat(fakeStoreApiProductPath);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO[]> products =
                restTemplate.getForEntity(baseUrl,FakeStoreProductResponseDTO[].class);

        return List.of(products.getBody());
    }

    public FakeStoreProductResponseDTO getProductById(int productId)
    {
        String baseUrl = fakeStoreApiBaseURL.concat(fakeStoreApiProductPath);
        baseUrl = baseUrl.concat("/"+productId);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO> products =
                restTemplate.getForEntity(baseUrl,FakeStoreProductResponseDTO.class);

        return products.getBody();
    }

    public List<FakeStoreCartResponseDTO> getCartByUserId(int userId)
    {
        String baseUrl = fakeStoreApiBaseURL.concat(fakeStoreCartPath);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreCartResponseDTO[]> cart =
                restTemplate.getForEntity(baseUrl, FakeStoreCartResponseDTO[].class);

        return List.of(cart.getBody());
    }
}
