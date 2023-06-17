package com.medron.jpa.repository;

import com.medron.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Optional<Product> findByName(String name);

    @Query("select p from Product p where p.name= ?1 or p.description = ?2")
    Product x(String name, String description);
}
