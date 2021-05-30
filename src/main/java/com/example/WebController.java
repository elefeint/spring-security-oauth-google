package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Value("${google_client-id}")
    private String googleClientId;

    @GetMapping("/getClientId")
    public String getGoogleClientId() {
        return googleClientId;
    }
}
