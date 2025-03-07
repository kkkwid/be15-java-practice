package com.kkkwid.comprehensive.persistence;

import com.kkkwid.comprehensive.domain.User;
import java.util.List;

public interface UserRepository {
    void saveUsers(List<User> users);
    List<User> loadUsers();
    void removeUser(String id, String password);
}

