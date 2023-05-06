package com.java.lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamMapCollectExample {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1,"Ramesh","secrete","ramesh@gmail.com"));
        users.add(new User(2,"Tony","secrete","tony@gmail.com"));
        users.add(new User(3,"Tom","secrete","tom@gmail.com"));

        // using stream map method to convert user into userDTO object list
        users.stream()
                .map(user -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
                .forEach(userDto -> System.out.println(userDto));
    }
}
class UserDTO{
    private int id;
    private String userName;
    private String email;

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
class User{
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}