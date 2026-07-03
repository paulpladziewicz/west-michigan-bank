package com.paulpladziewicz.onboarding_orchestrator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/onboarding")
public class OnboardingController {

    @GetMapping("/start")
    public ResponseEntity<Map<String, String>> getCustomerProfile() {
        return ResponseEntity.ok(Map.of("message", "Customer Profile"));
    }
}
