package com.example.sketch.request.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author subaru
 */
@Controller
public class TestController {
    @GetMapping("test")
    public String test() {
        return "pages/test";
    }
}
