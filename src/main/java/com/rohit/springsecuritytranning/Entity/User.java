package com.rohit.springsecuritytranning.Entity;

public class User {
    private String username;
    private String password;
    private String role;
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}
