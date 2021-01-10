package pl.sda.EventusApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class RegisterController {
    @GetMapping("/register")
    public String showLoginForm() {
        return "registerForm";
    }


}
