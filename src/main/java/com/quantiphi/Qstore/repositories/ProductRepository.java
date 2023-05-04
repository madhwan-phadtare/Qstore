package com.quantiphi.Qstore.repositories;

import com.quantiphi.Qstore.entities.Product;
import java.util.List;

public interface ProductRepository {

    /**
     * Returns a list of all products in the repository.
     */
    List<Product> findAllProducts();

    /**
     * Returns a list of products in the repository that are associated with the given seller ID.
     * @param sellerId the ID of the seller to search for
     */
    List<Product> findProductsBySellerId(String sellerId);

    /**
     * Returns a list of products in the repository that belong to the given category.
     * @param category the category to search for
     */
    List<Product> findProductsByCategory(String category);

    /**
     * Returns the product in the repository with the given ID.
     * @param productId the ID of the product to search for
     */
    Product findProductByProductId(String productId);

    /**
     * Saves the given product to the repository.
     * @param product the product to save
     */
    Product save(Product product);

    /**
     * Updates the given product in the repository.
     * @param product the product to update
     */
    Product updateProduct(Product product);

    /**
     * Deletes the product with the given ID from the repository.
     * @param productId the ID of the product to delete
     */
    Product deleteById(String productId);
}
