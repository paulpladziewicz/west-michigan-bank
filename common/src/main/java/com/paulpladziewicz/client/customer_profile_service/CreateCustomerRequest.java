package com.paulpladziewicz.client.customer_profile_service;

import jakarta.validation.constraints.NotBlank;

public record CreateCustomerRequest(
        @NotBlank String firstName,
        String middleName,
        @NotBlank String lastName
) {
}
