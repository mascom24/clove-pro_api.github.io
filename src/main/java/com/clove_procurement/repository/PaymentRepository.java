package com.clove_procurement.repository;

import com.clove_procurement.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {
    Payment getPaymentByCustomer(String customer);
}
