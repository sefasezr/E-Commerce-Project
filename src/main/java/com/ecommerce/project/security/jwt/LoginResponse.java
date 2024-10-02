package com.ecommerce.project.security.jwt;

import java.util.List;

public class LoginResponse {
    private String jwtToken;

    private String username;
    private List<String> roles;

    public LoginResponse(String username,List<String> roles, String jwtToken) {
        this.username = username;
        this.roles = roles;
        this.jwtToken = jwtToken;
    }

    public String getJwtToken() {
        return jwtToken;
    }

}
