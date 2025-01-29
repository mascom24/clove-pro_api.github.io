package com.clove_procurement.repository;

import com.clove_procurement.model.Audit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditRepository extends JpaRepository<Audit,Long> {
    Audit getAuditByCustomerName(String customerName);
}
