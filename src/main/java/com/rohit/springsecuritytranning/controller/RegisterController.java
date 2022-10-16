package com.rohit.springsecuritytranning.controller;

import com.rohit.springsecuritytranning.Entity.User;
import com.rohit.springsecuritytranning.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RegisterController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/test")
    public String test() {
        return "/test is accessed";
    }

    @PostMapping("/register")
    public  void register(@RequestBody User user){
        // input validation omitted for brevity
        user.setPassword( passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

    }

}
