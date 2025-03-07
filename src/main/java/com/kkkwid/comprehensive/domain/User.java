package com.kkkwid.comprehensive.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String id;
    private String password;
    private String phoneNumber;
    private int age;

    public User(String name, String id, String password, String phoneNumber, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public String getPassword() { return password; }
    public String getPhoneNumber() { return phoneNumber; }
    public int getAge() { return age; }
}
