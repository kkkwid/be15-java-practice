package com.kkkwid.comprehensive.service;

import com.kkkwid.comprehensive.domain.User;
import com.kkkwid.comprehensive.persistence.UserRepository;
import com.kkkwid.comprehensive.persistence.UserFileRepository;
import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserFileRepository();
    }

    public void registerUser(String name, String id, String password, String phoneNumber, int age) {
        List<User> users = userRepository.loadUsers();
        for (User user : users) {
            if (user.getId().equals(id)) {
                throw new IllegalArgumentException("이미 존재하는 아이디입니다.");
            }
        }
        users.add(new User(name, id, password, phoneNumber, age));
        userRepository.saveUsers(users);
    }

    public void removeUser(String id, String password) {
        userRepository.removeUser(id, password);
    }

    public User findUserById(String id) {
        for (User user : userRepository.loadUsers()) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
