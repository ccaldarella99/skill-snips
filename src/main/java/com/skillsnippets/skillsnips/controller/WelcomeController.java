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
        log.info("root/index method called");
        model.addAttribute("title", "Skill Snippets");
        return "index";
    }

    @GetMapping("/skills")
    public String skills(Model model) {
        log.info("skills method called");
        model.addAttribute("title", "Skills");
        return "skills";
    }
}
