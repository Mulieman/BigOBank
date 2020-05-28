package com.bank.bigobank.serviceImpl;

import com.bank.bigobank.domain.User;
import com.bank.bigobank.repository.UserRepository;
import com.bank.bigobank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceIml  implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<List<User>> getAllUser() {
        return Optional.of(userRepository.findAll());
    }


    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
    userRepository.deleteById(id);
    }
}
