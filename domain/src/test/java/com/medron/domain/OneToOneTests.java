package com.medron.domain;

import com.medron.domain.entity.Address;
import com.medron.domain.entity.Invoice;
import com.medron.domain.repository.AddressRepository;
import com.medron.domain.repository.InvoiceRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
@Log4j2
@SpringBootTest
public class OneToOneTests {
    @Autowired
    private InvoiceRepository repository;
    @Autowired
    private AddressRepository addressRepository;




    @Test
    public void uniDirectionTest(){
        Address address = Address.builder().street("Lotus").postalCode("34903").build();
        Invoice invoice = Invoice.builder().name("Medet").address(address).price("1000").build();
        repository.save(invoice);
        log.info(invoice);
        assertThat(invoice).isNotNull();
    }

    @Test
    public void biDirectionTest(){
        Address address = Address.builder().street("Lotus").postalCode("34903").build();
        Invoice invoice = Invoice.builder().name("Medet").address(address).price("1000").build();
        repository.save(invoice);
        log.info(addressRepository.findById(5).orElseThrow().toString());
    }
}
