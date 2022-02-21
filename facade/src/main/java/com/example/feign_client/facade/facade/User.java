package com.example.feign_client.facade.facade;

public class User {
    private final String name;
    private final String login;

    public User(String name, String login) {
        this.name = name;
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
               "name='" + name + '\'' +
               ", login='" + login + '\'' +
               '}';
    }
}
