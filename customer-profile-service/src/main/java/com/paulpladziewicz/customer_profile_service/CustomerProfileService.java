package com.paulpladziewicz.customer_profile_service;

import com.paulpladziewicz.dto.CreateCustomerRequest;
import org.springframework.stereotype.Service;

@Service
public class CustomerProfileService {

    private final CustomerProfileRepository customerProfileRepository;
    private final CustomerProfileMapper customerProfileMapper;

    CustomerProfileService(CustomerProfileRepository customerProfileRepository, CustomerProfileMapper customerProfileMapper) {
        this.customerProfileRepository = customerProfileRepository;
        this.customerProfileMapper = customerProfileMapper;
    }

    public void createCustomer(CreateCustomerRequest request) {
        customerProfileRepository.save(customerProfileMapper.toEntity(request));
    }
}