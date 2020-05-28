package com.bank.bigobank.service;

import com.bank.bigobank.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService{
    User create(User user);
    Optional<User> getUserById(Long id);
    Optional<List<User>> getAllUser();
    User update( User user);
    void delete(Long id);
}
