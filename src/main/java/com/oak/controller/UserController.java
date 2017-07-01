package com.oak.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by Chennl on 6/26/2017.
 */
@RestController

public class UserController {
        @RequestMapping("/hello")
        public String hello() {
            return "Hello";
        }
    @RequestMapping("/api/user")
    public String user() {
        return "user name: chennl";
    }

}
