package com.taller.Temperatura.persistence.repository;

import com.taller.Temperatura.persistence.crud.UserCrud;
import com.taller.Temperatura.persistence.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {

    private final UserCrud userCrud;

    @Autowired
    public UserRepository(UserCrud userCrud) {
        this.userCrud = userCrud;
    }

    public Optional<User> getUserByUsername(String username) {
        return userCrud.findByUsername(username);
    }

    public Optional<User> getUserByEmail(String email) {
        return userCrud.findByEmail(email);
    }

    public User save(User user) {
        return userCrud.save(user);
    }

    public void deleteById(Long id) {
        userCrud.deleteById(id);
    }
}
