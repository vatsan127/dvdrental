package dev.srivatsan.dvdrental.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "filmId")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int filmId;
    private String filmName;

}
