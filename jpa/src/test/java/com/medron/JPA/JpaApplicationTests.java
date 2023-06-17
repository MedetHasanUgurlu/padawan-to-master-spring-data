package com.medron.jpa;

import com.medron.jpa.entity.Product;
import com.medron.jpa.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

@Log4j2
@SpringBootTest
@DataJpaTest
@RequiredArgsConstructor
class JpaApplicationTests {
	private final ProductRepository repository;

	@Test
	void create(){
		Product product = new Product();
		product.setName("Cola");
		product.setQuantity(15);
		product.setDescription("coco cola is sucks");
		repository.save(product);
		log.info(product);

	}

	@Test
	void findByName(){
		log.info(repository.findByName("Cola").orElseThrow());
	}


}
