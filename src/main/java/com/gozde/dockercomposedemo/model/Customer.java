package com.gozde.dockercomposedemo.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "customer")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

//    public Customer(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public Customer() {
//    }
}
