package dev.srivatsan.dvdrental.controller;

import dev.srivatsan.dvdrental.entity.Address;
import dev.srivatsan.dvdrental.repo.AddressRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressRepo addressRepo;

    public AddressController(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable int id) {
        log.info("Incoming Request for getAddressById : '{}'", id);
        Optional<Address> result = addressRepo.findById(id);
        return ResponseEntity.ok(result.get());
    }

}
