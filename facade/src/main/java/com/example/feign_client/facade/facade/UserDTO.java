package com.example.feign_client.facade.facade;

public class UserDTO {

    private String name;
    private String login;

    public UserDTO() {
    }

    public UserDTO(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public User toUser() {
        return new User(name, login);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
               "name='" + name + '\'' +
               ", login='" + login + '\'' +
               '}';
    }
}
