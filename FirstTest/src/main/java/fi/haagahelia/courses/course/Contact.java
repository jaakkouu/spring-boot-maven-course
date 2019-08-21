package fi.haagahelia.course.Exercise;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Contact {

    @RequestMapping("/contact")
    public String main() {
        return "This is the contact page";
    }

}