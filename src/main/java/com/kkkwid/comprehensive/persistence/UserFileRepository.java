package com.kkkwid.comprehensive.persistence;

import com.kkkwid.comprehensive.domain.User;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserFileRepository implements UserRepository {
    private final String filePath = "src/main/java/com/kkkwid/comprehensive/db/userDB.dat";

    @Override
    public void saveUsers(List<User> users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> loadUsers() {
        File file = new File(filePath);
        if (!file.exists() || file.length() == 0) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @Override
    public void removeUser(String id, String password) {
        List<User> users = loadUsers();
        users.removeIf(user -> user.getId().equals(id) && user.getPassword().equals(password));
        saveUsers(users);
    }
}

