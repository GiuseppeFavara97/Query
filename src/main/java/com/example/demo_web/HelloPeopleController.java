package com.example.demo_web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloPeopleController {

    @GetMapping(path = "/ciao")
    public String ciao(@RequestParam String nome, @RequestParam String provincia ){
        return "Ciao " + nome + ", che tempo fa in " + provincia + "?";
    }
}
