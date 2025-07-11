package dev.srivatsan.dvdrental.service;

import dev.srivatsan.dvdrental.entity.Customer;
import dev.srivatsan.dvdrental.exception.CustomerNotFoundException;
import dev.srivatsan.dvdrental.repo.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer getCustomerById(int id) {
        Optional<Customer> result = customerRepo.findById(id);
        if (result.isEmpty()) {
            throw new CustomerNotFoundException(id);
        }
        return result.get();
    }

    public Customer saveCustomer(Customer customer) {
        Customer save = customerRepo.save(customer);
        return save;
    }
}
