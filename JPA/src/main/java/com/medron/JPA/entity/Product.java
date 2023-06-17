package com.medron.JPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
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
