package com.medron.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Builder
@Setter
@Table(name = "products",uniqueConstraints = {@UniqueConstraint(name = "productName",columnNames = "name")})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generator" )
    @SequenceGenerator(name = "product_generator", sequenceName = "product_sequence_name",allocationSize = 1)
    private int id;
    private String name;
    private String description;
    private int quantity;

}