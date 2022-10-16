package com.rohit.springsecuritytranning.config;

import com.rohit.springsecuritytranning.Entity.SecureUser;
import com.rohit.springsecuritytranning.Entity.User;
import com.rohit.springsecuritytranning.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

   private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(username)
                .orElseThrow(() -> new BadCredentialsException("username or password doesn't match"));

        return new SecureUser(user);
    }
}
