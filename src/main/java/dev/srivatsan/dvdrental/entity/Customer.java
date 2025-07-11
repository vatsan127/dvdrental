package dev.srivatsan.dvdrental.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerSequence")
    @SequenceGenerator(name = "customerSequence", sequenceName = "customer-seq", allocationSize = 75)
    private int customer_id;
    private String firstName;
    private String lastName;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;


}
