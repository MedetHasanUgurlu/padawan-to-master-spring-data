package com.medron.jpamaster.repository;


import com.medron.jpamaster.domain.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;


@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    ProductRepository repository;
    @Test
    void s(){
        Sort sort = Sort.by("name").ascending();
        Pageable pageable = PageRequest.of(0,5);
        Page<Product> page = repository.findAll(pageable);
        List<Product> products = page.getContent();
        products.forEach(System.out::println);

        Pageable pageable1 = PageRequest.of(0,5,sort);
    }



}