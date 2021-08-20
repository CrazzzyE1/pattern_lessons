package com.company.hw6;

public class User {
    private Long id;
    private String login;
    private String password;
    private boolean active;

    public User(Long id, String login, String password, boolean active) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.active = active;
    }
}
