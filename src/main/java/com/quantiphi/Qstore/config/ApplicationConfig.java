package com.quantiphi.Qstore.config;

import com.quantiphi.Qstore.repositories.*;
import com.quantiphi.Qstore.services.CartServices;
import com.quantiphi.Qstore.services.ReviewService;
import com.quantiphi.Qstore.services.SellerServices;
import com.quantiphi.Qstore.services.UserServices;

public class ApplicationConfig {

    public static final ProductRepository productRepository = new ProductRepositoryDummyImpl();
    public static final CartRepository cartRepository = new CartRepositoryDummyImpl();
    public static final ReviewRepository reviewRepository = new ReviewRepositoryDummyImpl();
    public static final CartServices cartServices = new CartServices();
    public static final ReviewService reviewServices = new ReviewService();
    public static final SellerServices sellerServices = new SellerServices();
    public static final UserServices userServices = new UserServices();


}
