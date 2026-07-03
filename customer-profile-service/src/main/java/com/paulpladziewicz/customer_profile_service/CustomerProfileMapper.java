package com.paulpladziewicz.customer_profile_service;

import com.paulpladziewicz.dto.CreateCustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerProfileMapper {
    @Mapping(target = "customerId", ignore = true)
    CustomerProfile toEntity(CreateCustomerRequest request);
}
