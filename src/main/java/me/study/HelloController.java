package me.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @Autowired
    HelloSevice helloSevice;

    @GetMapping("/hello")
    public @ResponseBody String Hello() {
        return "Hello " + helloSevice.getName();
    }

    @GetMapping("/sample")
    public String sample() {
        return "/WEB-INF/sample.jsp";
    }
}
