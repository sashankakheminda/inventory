package com.example.inventory.service;

import com.example.inventory.model.Product;
import com.example.inventory.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class InventoryServiceTest {
    @Mock
    private ProductRepository productRepository;

    @Test
    void getAllProducts() {
        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Product A");
        product1.setQuantity(10);
        product1.setPrice(19.99);

        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("Product B");
        product2.setQuantity(5);
        product2.setPrice(9.99);
        List<Product> products = Arrays.asList(product1, product2);
        when(productRepository.findAll()).thenReturn(products);

        // Create an instance of the InventoryService
        InventoryService inventoryService = new InventoryService(productRepository);

        // Call the method under test
        List<Product> availableProducts = inventoryService.getAllProducts();

        // Assertions
        assertEquals(products, availableProducts);
        verify(productRepository, times(1)).findAll();
    }
}