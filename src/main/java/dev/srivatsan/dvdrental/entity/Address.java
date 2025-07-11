package dev.srivatsan.dvdrental.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addressSequence")
    @SequenceGenerator(name = "addressSequence", sequenceName = "address-seq", allocationSize = 75)
    private int id;
    private String address;
    private String district;
    private int postalCode;
    private String phone;

}
