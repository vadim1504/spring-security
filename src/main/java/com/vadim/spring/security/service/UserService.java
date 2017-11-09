package com.vadim.spring.security.service;

import com.vadim.spring.security.web.dto.UserRegistrationDto;
import com.vadim.spring.security.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);

    void updatePassword(String password, Long userId);
}
