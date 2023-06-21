package com.medron.domain.repository;

import com.medron.domain.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
}
