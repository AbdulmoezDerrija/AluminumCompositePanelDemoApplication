package com.example.aluminumcompositepaneldemoapplication.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public void addNewCustomer(Customer customer) {
        Optional<Customer> customerOptional = customerRepository
                .findCustomerByEmail(customer.getEmail());
        if (customerOptional.isPresent()) {
            throw new IllegalStateException("Email is already used!.");
        }
        customerRepository.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        boolean customerExists = customerRepository.existsById(customerId);
        if (!customerExists) {
            throw new IllegalStateException("the customer ID " + customerId + " provided, does NOT exists!.");
        }
        customerRepository.deleteById(customerId);

    }
}
