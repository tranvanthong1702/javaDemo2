package com.example.demo2.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping()
public class demo {
    @GetMapping("/home")
    public String home() {

        return "index";  // Return tên của View, model sẽ tự động pass vào view
    }
}
