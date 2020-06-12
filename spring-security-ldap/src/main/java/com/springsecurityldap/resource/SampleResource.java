package com.springsecurityldap.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/sample")
public class SampleResource {

    @GetMapping("/check")
    public String check() {

        return "welcome to sample page!!";
    }
}
