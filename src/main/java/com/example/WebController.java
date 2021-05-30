package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WebController {

    @Value("${google_client-id}")
    private String googleClientId;

    @GetMapping("/getClientId")
    public String getGoogleClientId() {
        return googleClientId;
    }

    @GetMapping("/getServerInfo")
    public Map<String, Object> getServerIdentity(Authentication auth) {
        Jwt authUser = (Jwt) auth.getPrincipal();
        return authUser.getClaims();
    }
}
