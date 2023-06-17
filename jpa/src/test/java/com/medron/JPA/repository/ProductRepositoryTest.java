package com.medron.jpa.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DataJpaTest
@RequiredArgsConstructor
class ProductRepositoryTest {
    private final ProductRepository repository;

}