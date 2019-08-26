package fi.haagahelia.courses.course.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.courses.course.model.Friend;

@Controller
public class Index {
    private ArrayList<Friend> friends = new ArrayList<Friend>();

    public Index(){
        friends.add(new Friend("Anna", "Huikka"));
        friends.add(new Friend("Johan", "Kesti")); 
        friends.add(new Friend("Lempi", "Patja"));
    }

    @RequestMapping("/index")
    public String main(Model model) {
        model.addAttribute("friend", new Friend("", ""));
        model.addAttribute("friends", friends);
        return "index";
    }

    @PostMapping("/index")
    public String friendSubmit(@ModelAttribute Friend friend, Model model){
        friends.add(friend);
        return "redirect:index";
    }

}