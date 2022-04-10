package com.itheima;

public class User2 {

    private int id;
    private String username;
    private String password;

    private User1 user1;

    public void setUser1(User1 user1) {
        this.user1 = user1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User2{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", user1=" + user1 +
                '}';
    }
}
