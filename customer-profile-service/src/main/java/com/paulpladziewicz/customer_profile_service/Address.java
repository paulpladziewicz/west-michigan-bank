package com.paulpladziewicz.customer_profile_service;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customer_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long addressId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerProfile customer;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AddressType addressType;

    @Column(nullable = false)
    private String streetLine1;

    private String streetLine2;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false, length = 2)
    private String state;

    @Column(nullable = false, length = 10)
    private String postalCode;

    @Column(nullable = false, length = 2)
    private String country = "US";
}
