package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String showWelcomePage() {
        return "html/welcome";
    }

    @GetMapping("/loginoptions")
    public String showLoginOptions() {
        return "html/loginOptions";
    }

    @GetMapping("/signup")
    public String showSignUpPage() {
        return "html/signup";
    }

    @GetMapping("/dashboard")
    public String showDashboard() {
        return "html/dashboard";
    }
}
