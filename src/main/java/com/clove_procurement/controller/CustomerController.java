package com.clove_procurement.controller;

import com.clove_procurement.model.Customer;
import com.clove_procurement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clove-pro/Customer")
@CrossOrigin(origins = "*")
public class CustomerController {
    @Autowired
    private CustomerService service;
    @GetMapping
    public List<Customer> getAllCustomer(){
        return service.getAllCustomer();
    }
    @GetMapping("/{customerId}")
    public Customer getCustomerById(@PathVariable Long customerId){
        return service.getCustomerById(customerId);
    }
    @PostMapping
    public Customer registerCustomer(@RequestBody Customer customer){
        return service.registerCustomer(customer);
    }
    @DeleteMapping("/{customerId}")
    public void deleteCustomerById(@PathVariable Long customerId){
        service.deleteCustomerById(customerId);
    }
    @PutMapping("/{customerId}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long customerId,@RequestBody Customer customer){
        Customer updateCustomer=service.updateCustomer(customerId,customer);
        return ResponseEntity.ok(updateCustomer);
    }
}
