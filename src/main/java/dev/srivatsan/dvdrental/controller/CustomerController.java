package dev.srivatsan.dvdrental.controller;

import dev.srivatsan.dvdrental.entity.Customer;
import dev.srivatsan.dvdrental.repo.CustomerRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerRepo customerRepo;

    public CustomerController(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {
        Optional<Customer> result = customerRepo.findById(id);
        return ResponseEntity.ok(result.get());
    }

    @PostMapping("/save")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        log.info("CustomerController :: Save customer :: {}", customer);
        Customer savedCustomer = customerRepo.save(customer);
        return ResponseEntity.ok(savedCustomer);
    }

}
