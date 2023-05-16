package com.Credentials.Service;

import com.Credentials.Model.User;

public interface UserService {
    void registerUser(User user);

    User loginUser(String email, String password);
}
