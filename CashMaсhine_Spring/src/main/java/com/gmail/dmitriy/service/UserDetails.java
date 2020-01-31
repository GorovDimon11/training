package com.gmail.dmitriy.service;

import com.gmail.dmitriy.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserDetails implements UserDetailsService {
    private final UserRepository userRepository;

    @Autowired
    public UserDetails(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String e) throws UsernameNotFoundException {
        log.warn("Login attempt email " + e);
        return userRepository
                .findByEmail(e)
                .orElseThrow(() -> new UsernameNotFoundException(e + "Not found"));
    }
}
