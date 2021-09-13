package com.skillsnippets.skillsnips.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String index(Model model) {
        log.info("root method called");
        model.addAttribute("message", "Skill Snippets");
        return "index";
    }
}
