package com.gmail.dmitriy.service;

import com.gmail.dmitriy.entity.User;
import com.gmail.dmitriy.entity.UserRole;
import com.gmail.dmitriy.exception.UserExistException;
import com.gmail.dmitriy.exception.UserNotFoundException;
import com.gmail.dmitriy.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
public class UserService {
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public void saveNewUser(User user) throws UserExistException {
        user.setRole(UserRole.CASHIER);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        try {
            userRepository.save(user);
            log.debug("Added new user " + user.getEmail());
        } catch (Exception ex) {
            throw new UserExistException();
        }
    }

    public List<User> allUsers() {
        return userRepository.findAll();
    }

    public UserRole getUserRole(String email) {
        return userRepository
                .findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User with Email " + email + "not found"))
                .getRole();
    }

    @Transactional
    public void updateUserRole(String email, UserRole role) throws UserNotFoundException {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UserNotFoundException("User with email " + email + " is not found"));

        user.setRole(role);
        userRepository.save(user);
    }


}
