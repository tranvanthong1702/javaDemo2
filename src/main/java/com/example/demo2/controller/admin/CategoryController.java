package com.example.demo2.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/admin/categories")
public class CategoryController {
    @GetMapping("/add")
    public String add(){
        return "admin/categories/addOrEdit";
    }
    @GetMapping("/edit/{categoryId}")
    public String edit(){
        return "admin/categories/addOrEdit";
    }
    @GetMapping("/delete/{catgoryId}")
    public String delete(){
        return "redirect:admin/categories";
    }
    @GetMapping("")
    public String list(){
        return "admin/categories/list";
    }
    @GetMapping("/search")
    public  String search(){
        return "admin/categories/search";
    }

}
