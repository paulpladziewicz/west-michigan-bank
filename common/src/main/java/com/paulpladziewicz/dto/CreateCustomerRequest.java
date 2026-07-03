package com.paulpladziewicz.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateCustomerRequest(
        @NotBlank String firstName,
        String middleName,
        @NotBlank String lastName
) {
}
