package fi.haagahelia.courses.course;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class Hello {
    @RequestMapping(
        value = "/hello", 
        params = { "location", "name" }
    )
    @ResponseBody
    public String hello(@RequestParam(required=false, value="location") String loc, @RequestParam(required=false, value="name") String name) {
        return "Welcome to the " + loc + " " + name;
    }
}
