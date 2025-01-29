package com.clove_procurement.controller;

import com.clove_procurement.model.Payment;
import com.clove_procurement.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clove-pro/Payment")
@CrossOrigin(origins = "*")
public class PaymentController {
    @Autowired
    private PaymentService service;
    @GetMapping
    public List<Payment> getAllPayment(){
        return service.getAllPayment();
    }
    @GetMapping("/{paymentId}")
    public Payment getPaymentById(@PathVariable Long paymentId){
        return service.getPaymentById(paymentId);
    }
    @PostMapping
    public Payment registerPayment(@RequestBody Payment payment){
        return service.registerPayment(payment);
    }
    @DeleteMapping("/{paymentId}")
    public void deletePaymentById(@PathVariable Long paymentId){
        service.getPaymentById(paymentId);
    }
    @PutMapping("/{paymentId}")
    public ResponseEntity<Payment> updatePayment (@PathVariable Long paymentId,@RequestBody Payment payment){
        Payment updatePayment=service.updatePayment(paymentId,payment);
        return ResponseEntity.ok(updatePayment);
    }
}
