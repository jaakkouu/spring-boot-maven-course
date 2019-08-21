package fi.haagahelia.course.Exercise;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Index {

    @RequestMapping("/index")
    public String main() {
        return "This is the main page";
    }

}