package com.RSVchatApp.chatApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class route{

    @GetMapping("/profile")
    public String profile(){
        return "User Profile";
    }
}
