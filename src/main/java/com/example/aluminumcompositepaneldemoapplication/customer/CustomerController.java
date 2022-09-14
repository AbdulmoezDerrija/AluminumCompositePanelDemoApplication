package com.example.aluminumcompositepaneldemoapplication.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.List;


@RestController
@RequestMapping(value = "/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();

    }

//    @GetMapping(path = "{customerId}")
//    public Customer getCustomerById(@PathVariable("customerId") Long customerId) {
//        Customer customerById = customerService.
//                getCustomerById(customerId);
//        return customerById;
//
//    }

    @GetMapping(path = ("{customerEmail}"))
    public Customer getCustomerByEmail(@PathVariable("customerEmail") String customerEmail) {
        Customer customerByEmail = customerService.
                getCustomerByPhoneNumber(customerEmail);
        return customerByEmail;

    }

    @PostMapping
    public void registerNewCustomer(@RequestBody Customer customer) {
        customerService.addNewCustomer(customer);
    }

    @DeleteMapping(path = "{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Long customerId) {
        customerService.deleteCustomer(customerId);
    }

    @PutMapping(path = "{customerId}")
    public void updateCustomerById(
            @PathVariable("customerId") Long customerId,
            @RequestParam(required = false) String fistName,
            @RequestParam(required = false) String email) {
        customerService.updateCustomerById(customerId, fistName, email);
    }
}

