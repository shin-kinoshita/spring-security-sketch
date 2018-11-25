package com.example.sketch.request.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author subaru
 */
@Controller
@RequestMapping("/auth")
public class AuthController {
    @GetMapping("required")
    public String required(HttpServletRequest request) {
        return "auth_required";
    }
}
