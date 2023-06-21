package com.medron.jpamaster;


import com.medron.jpamaster.domain.Order;
import com.medron.jpamaster.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
public class OneToOneDirection {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Test
    public void biDirectionTest(){
        Address address = Address.builder().street("Lotus").city("Istanbul").build();
        Order order = Order.builder().address(address).orderTrackingCode("AS13SVB").build();
        addressRepository.save(address);
        orderRepository.save(order);
        System.out.println("Address: " + address);
        System.out.println("Order: "+order);
    }
}
