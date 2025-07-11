package dev.srivatsan.dvdrental.controller;

import dev.srivatsan.dvdrental.entity.Customer;
import dev.srivatsan.dvdrental.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {
        log.info("CustomerController :: Get customer by id - '{}'", id);
        Customer customer = customerService.getCustomerById(id);
        return ResponseEntity.ok(customer);
    }

    @PostMapping("/save")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        log.info("CustomerController :: Save customer :: {}", customer);
        Customer savedCustomer = customerService.saveCustomer(customer);
        return ResponseEntity.ok(savedCustomer);
    }

}
