package org.ko.standalone.web.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SystemController {

    @GetMapping
    public String visitor() {
        return "login";
    }

    @PostMapping
    public String login(String username, String password, Model model) {
        return "index";
    }

}
