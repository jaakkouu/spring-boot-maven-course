package fi.haagahelia.courses.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {
    @GetMapping("/hello")
    public String main(
        @RequestParam(name="name", required=false) String name, 
        @RequestParam(name="age", required=false) String age,
        Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "hello.html";
    }
}