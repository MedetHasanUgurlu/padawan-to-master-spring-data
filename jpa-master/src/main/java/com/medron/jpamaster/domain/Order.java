package com.medron.jpamaster.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Builder
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String orderTrackingCode;
    @OneToOne
    @JoinColumn(name = "billing_address_id",referencedColumnName = "id")
    private Address address;

}
