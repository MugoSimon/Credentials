package com.Credentials.Controller;

import com.Credentials.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    public LoginController(UserService userService) {
    }

    @GetMapping
    public String showLoginForm() {
        return "login";
    }

    @PostMapping
    public String login(String email, String password) {
        // Perform login logic using userService.loginUser(email, password)
        return "redirect:/login";
    }
}

