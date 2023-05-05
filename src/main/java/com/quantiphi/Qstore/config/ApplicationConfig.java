package com.quantiphi.Qstore.config;

import com.quantiphi.Qstore.repositories.CartRepository;
import com.quantiphi.Qstore.repositories.CartRepositoryDummyImpl;
import com.quantiphi.Qstore.repositories.ProductRepository;
import com.quantiphi.Qstore.repositories.ProductRepositoryDummyImpl;

public class ApplicationConfig {

    public static final ProductRepository productRepository = new ProductRepositoryDummyImpl();
    public static final CartRepository cartRepository = new CartRepositoryDummyImpl();

}
