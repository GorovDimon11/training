package com.gmail.dmitriy.entity;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    GUEST,
    CASHIER,
    SENIOR_CASHIER,
    MERCHANDISER;

    @Override
    public String getAuthority() {
        return this.name();
    }
}
