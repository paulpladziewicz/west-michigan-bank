package com.paulpladziewicz.customer_profile_service;

import com.paulpladziewicz.dto.CreateCustomerRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerProfileController {

    private final CustomerProfileService customerProfileService;

    public CustomerProfileController(CustomerProfileService customerProfileService) {
        this.customerProfileService = customerProfileService;
    }

    @GetMapping()
    public ResponseEntity<String> create(@Valid @RequestBody CreateCustomerRequest dto) {
        customerProfileService.createCustomer(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
