package com.quantiphi.Qstore.services;

import com.quantiphi.Qstore.entities.Product;
import com.quantiphi.Qstore.repositories.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class SellerServicesTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private SellerServices sellerServices;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveProduct() {
        Product product = new Product();
        product.setProductName("Test Product");
        product.setSellerId("123");
        product.setPrice("10.0");
        product.setAvgRating("0");
        product.setRatingIds(new ArrayList<>());
        product.setReviewIds(new ArrayList<>());

        when(productRepository.save(product)).thenReturn(product);

        Product savedProduct = sellerServices.saveProduct(product);

        assertEquals(product.getProductName(), savedProduct.getProductName());
        assertEquals(product.getSellerId(), savedProduct.getSellerId());
        assertEquals(product.getPrice(), savedProduct.getPrice());
        assertEquals(product.getAvgRating(), savedProduct.getAvgRating());
        assertEquals(product.getRatingIds(), savedProduct.getRatingIds());
        assertEquals(product.getReviewIds(), savedProduct.getReviewIds());

        verify(productRepository, times(1)).save(product);
    }

    @Test
    public void testGetAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "123", "Product 1", "", "", "10.0", "0", new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));
        products.add(new Product("2", "123", "Product 2", "", "", "20.0", "0", new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));

        when(productRepository.findAllProducts()).thenReturn(products);

        List<Product> allProducts = sellerServices.getAllProducts();

        assertEquals(products.size(), allProducts.size());
        assertEquals(products.get(0).getProductName(), allProducts.get(0).getProductName());
        assertEquals(products.get(1).getProductName(), allProducts.get(1).getProductName());

        verify(productRepository, times(1)).findAllProducts();
    }

    @Test
    public void testGetAllProductsBySellerId() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "123", "Product 1", "", "", "10.0", "0", new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));
        products.add(new Product("2", "123", "Product 2", "", "", "20.0", "0", new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));

        when(productRepository.findProductsBySellerId("123")).thenReturn(products);

        List<Product> sellerProducts = sellerServices.getAllProductsBYSellerId("123");

        assertEquals(products.size(), sellerProducts.size());
        assertEquals(products.get(0).getProductName(), sellerProducts.get(0).getProductName());
        assertEquals(products.get(1).getProductName(), sellerProducts.get(1).getProductName());

        verify(productRepository, times(1)).findProductsBySellerId("123");
    }

    @Test
    public void testGetProductByProductId() {
        Product product = new Product("1", "123", "Product 1", "", "", "10.0", "0", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        when(productRepository.findProductByProductId("1")).thenReturn(product);

        Product foundProduct = sellerServices.getProductBYProductId("1");

        assertEquals(product.getProductName(), foundProduct.getProductName());
        assertEquals(product.getSellerId(), foundProduct.getSellerId());
        assertEquals(product.getPrice(), foundProduct.getPrice());
        assertEquals(product.getAvgRating(), foundProduct.getAvgRating());
        assertEquals(product.getRatingIds(), foundProduct.getRatingIds());
        assertEquals(product.getReviewIds(), foundProduct.getReviewIds());

        verify(productRepository, times(1)).findProductByProductId("1");
    }

    @Test
    public void testUpdateProduct() {
        Product product = new Product("1", "123", "Product 1", "", "", "10.0", "0", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        when(productRepository.updateProduct(product)).thenReturn(product);

        Product updatedProduct = sellerServices.updateProduct(product);

        assertEquals(product.getProductName(), updatedProduct.getProductName());
        assertEquals(product.getSellerId(), updatedProduct.getSellerId());
        assertEquals(product.getPrice(), updatedProduct.getPrice());
        assertEquals(product.getAvgRating(), updatedProduct.getAvgRating());
        assertEquals(product.getRatingIds(), updatedProduct.getRatingIds());
        assertEquals(product.getReviewIds(), updatedProduct.getReviewIds());

        verify(productRepository, times(1)).updateProduct(product);
    }

    @Test
    public void testDeleteProduct() {
        Product product = new Product("1", "123", "Product 1", "", "", "10.0", "0", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        when(productRepository.deleteById("1")).thenReturn(product);

        Product deletedProduct = sellerServices.deleteProduct("1");

        assertEquals(product.getProductName(), deletedProduct.getProductName());
        assertEquals(product.getSellerId(), deletedProduct.getSellerId());
        assertEquals(product.getPrice(), deletedProduct.getPrice());
        assertEquals(product.getAvgRating(), deletedProduct.getAvgRating());
        assertEquals(product.getRatingIds(), deletedProduct.getRatingIds());
        assertEquals(product.getReviewIds(), deletedProduct.getReviewIds());

        verify(productRepository, times(1)).deleteById("1");
    }
}
