package com.clove_procurement.service;

import com.clove_procurement.model.Payment;
import com.clove_procurement.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;
    public List<Payment> getAllPayment(){
        return repository.findAll();
    }
    public Payment getPaymentById(Long paymentId){
        return repository.findById(paymentId).orElse(null);
    }
    public Payment getPaymentByCustomer(String customer){
        return repository.getPaymentByCustomer(customer);
    }
    public Payment registerPayment(Payment payment){
        return repository.save(payment);
    }
    public Payment updatePayment(Long paymentId,Payment payment){
        Payment payment1=repository.findById(paymentId).get();
        payment1.setCustomer(payment.getCustomer());
        payment1.setQuantity(payment.getQuantity());
        payment1.setGrade(payment.getGrade());
        payment1.setAmount(payment.getAmount());
        payment1.setDate(payment.getDate());
        payment1.setConfirmation(payment.getConfirmation());
        return repository.save(payment1);
    }
}
