package fi.haagahelia.courses.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fi.haagahelia.courses.course.model.Student;

@Controller
public class StudentController {

    private List<Student> students = Arrays.asList(
        new Student("Anna", "Huikka"), 
        new Student("Johan", "Kesti"),
        new Student("Lempi", "Patja"),
        new Student("Marja", "Soppa"),
        new Student("Sini", "Sorsa")
    );

    @GetMapping("/hello")
    public String main(Model model) {
        model.addAttribute("students", students);
        return "studentList.html";
    }
}