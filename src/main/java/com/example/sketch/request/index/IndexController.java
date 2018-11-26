package com.example.sketch.request.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author subaru
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("csrf/passed")
    public String csrf() {
        return "csrf_passed";
    }
}
