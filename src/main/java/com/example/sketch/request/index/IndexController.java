package com.example.sketch.request.index;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collection;

/**
 * @author subaru
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index(HttpServletRequest request) {
        SecurityContext context = SecurityContextHolder.getContext();

        HttpSession session = request.getSession();
        SecurityContext securityContext = (SecurityContext)session.getAttribute("SPRING_SECURITY_CONTEXT");
        if (securityContext != null) {
            Authentication authentication = securityContext.getAuthentication();
            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
            Object credentials = authentication.getCredentials();
            Object details = authentication.getDetails();
            Object principal = authentication.getPrincipal();
        }
        return "pages/index";
    }
}
