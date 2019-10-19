package me.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloSevice helloSevice;

    @GetMapping("/hello")
    public String Hello() {
        return "Hello " + helloSevice.getName();
    }
}
