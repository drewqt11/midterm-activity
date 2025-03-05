package com.apas.oauth2login.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello, Person";
    }

    @GetMapping ("/secured")
    public String secured() {
        return "Hello, Secured";
    }
}
