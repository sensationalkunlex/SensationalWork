package com.sensationalk.android.assignmentk;

/**
 * Created by user on 29/06/2016.
 */
public class ModelClass {
    private String Email;
    private String Username;
    private String Password;
    private String Name;

    public ModelClass(String email, String name, String password, String username) {
        Email = email;
        Name = name;
        Password = password;
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
}
