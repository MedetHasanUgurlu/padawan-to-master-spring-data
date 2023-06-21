package com.medron.jpamaster.repository;

import com.medron.jpamaster.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
