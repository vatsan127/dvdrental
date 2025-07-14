package dev.srivatsan.dvdrental.repo;

import dev.srivatsan.dvdrental.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
}
