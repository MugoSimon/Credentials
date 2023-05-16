package com.Credentials.Controller;

import com.Credentials.Model.Log;
import com.Credentials.Service.LogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private final LogService logService;

    public HomeController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Log> logs = logService.getAllLogs();
        model.addAttribute("logs", logs);
        return "home";
    }
}
