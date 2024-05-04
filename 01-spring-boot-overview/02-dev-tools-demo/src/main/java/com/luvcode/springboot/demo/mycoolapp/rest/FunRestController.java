package com.luvcode.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHelloWorld(){
        return coachName;
    }

    @GetMapping("/fortune")
    public String fortune(){
        return teamName;
    }

    @GetMapping("/devtools")
    public String devtools(){
        return teamName;
    }

    @GetMapping("/devtoolsAwesome")
    public String devtoolsAwesome(){
        return teamName;
    }
}
