package com.clove_procurement.service;

import com.clove_procurement.model.Customer;
import com.clove_procurement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;
    public List<Customer> getAllCustomer(){
        return repository.findAll();
    }
    public Customer getCustomerById(Long customerId){
        return repository.findById(customerId).orElse(null);
    }
    public Customer getCustomerByName(String name){
        return repository.getCustomerByName(name);
    }
    public Customer registerCustomer(Customer customer){
        return repository.save(customer);
    }
    public void deleteCustomerById(Long customerId){
        repository.deleteById(customerId);
    }
    public Customer updateCustomer(Long customerId,Customer customer){
        Customer customer1=repository.findById(customerId).get();
        customer1.setName(customer.getName());
        customer1.setAddress(customer.getAddress());
        customer1.setPhone(customer.getPhone());
        customer1.setChet(customer.getChet());
        customer1.setDate(customer.getDate());
        return repository.save(customer1);
    }
}
