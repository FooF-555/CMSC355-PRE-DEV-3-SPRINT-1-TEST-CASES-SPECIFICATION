package src.main.java.com.example.demo;

import javax.annotation.processing.Generated;

import org.springframework.stereotype.Controller;

@Controller
public class PageController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("/signup");
    public String showSignUpPage() {
        return "signup";
    }

    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard";
    }
}
