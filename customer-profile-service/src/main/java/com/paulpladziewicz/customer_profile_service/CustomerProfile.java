package com.paulpladziewicz.customer_profile_service;

import com.paulpladziewicz.dto.CreateCustomerRequest;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "customer")
public class CustomerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long customerId;

    private String prefix;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses = new ArrayList<>();

    public void addAddress(Address address) {
        addresses.add(address);
        address.setCustomer(this); // Explicitly sets the foreign key side
    }

    public void removeAddress(Address address) {
        addresses.remove(address);
        address.setCustomer(null);
    }

    private String citizenship;
}
