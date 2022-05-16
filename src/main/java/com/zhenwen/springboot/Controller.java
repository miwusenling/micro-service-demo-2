package com.zhenwen.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/helloworld")
    public String helloworld() {
        System.out.println("my first spring boot program!");
		System.out.println("111");
		System.out.println("333");
		System.out.println("444");
		System.out.println("aaa");
        return "hello spring boot";
    }

}
