package com.rohit.springsecuritytranning.repo;

import com.rohit.springsecuritytranning.Entity.User;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class UserRepository {

    final private Map<String, User>  users= new ConcurrentHashMap<>();

    public Optional<User> findUserByUsername(String username) {
        return Optional.ofNullable(users.get(username));
    }

    public void save(User user) {
        users.put(user.getUsername(), user);
    }

}
