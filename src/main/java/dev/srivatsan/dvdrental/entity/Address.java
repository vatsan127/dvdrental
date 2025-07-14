package dev.srivatsan.dvdrental.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addressSequence")
    @SequenceGenerator(name = "addressSequence", sequenceName = "address-seq", allocationSize = 75)
    private int id;
    private String state;
    private String country;

    @OneToOne(mappedBy = "address")
    private Customer customer;

}
