package com.zhenwen.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/helloworld")
    public String helloworld() {
        Sysem.out.println("my first spring boot program!");
        return "hello spring boot";
    }

}
