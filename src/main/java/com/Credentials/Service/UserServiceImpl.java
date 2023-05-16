package com.Credentials.Service;

import com.Credentials.Model.User;
import com.Credentials.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(User user) {
        // Additional validation and password hashing can be performed here
        userRepository.save(user);
    }

    @Override
    public User loginUser(String email, String password) {
        // Perform login logic and return the user if successful
        return userRepository.findByEmail(email);
    }
}

