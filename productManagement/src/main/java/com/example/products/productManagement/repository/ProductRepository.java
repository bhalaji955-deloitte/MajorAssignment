package com.example.products.productManagement.repository;

import com.example.products.productManagement.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory( String category);
    @Query(nativeQuery = true, value = "SELECT * FROM product c WHERE c.price>:price and c.category = :category and c.rating>:rating")
    public List<Product> getByCategory(String rating,String price, String category) ;

    @Query(nativeQuery = true, value = "SELECT * FROM product order by price")
    List<Product> sortBYFieldPrice( String itemField);
    @Query(nativeQuery = true, value = "SELECT * FROM product order by rating")
    List<Product> sortBYFieldRating( String itemField);


    @Query(nativeQuery = true, value = "SELECT * FROM product where id = :id")
    Product getByProductId(Long id);



}
