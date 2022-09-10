package com.example.aluminumcompositepaneldemoapplication.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
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

    @Transactional
    public void updateCustomerById(Long customerId, String fistName, String email) {
        Customer customer = customerRepository.
                findById(customerId).
                orElseThrow(() -> new IllegalStateException("the customer to be updated. doesn't exists!."));
        if (fistName != null &&
                fistName.length() > 0 &&
                !Objects.equals(customer.getFistName(), fistName)) {
            customer.setFistName(fistName);
        }
        if (email != null &&
                email.length() > 0 &&
                !Objects.equals(customer.getEmail(), email)) {
            Optional<Customer> customerOptional = customerRepository.findCustomerByEmail(email);
            if (customerOptional.isPresent()) {
                throw new IllegalStateException("email taken!.");
            }
            customer.setEmail(email);
        }
    }
}
