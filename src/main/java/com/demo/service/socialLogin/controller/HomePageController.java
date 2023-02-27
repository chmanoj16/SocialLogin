package com.demo.service.socialLogin.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/home")
    public String homePage(Model model, @AuthenticationPrincipal OAuth2User principal) {
        if (principal != null) {
            String principalName = principal.getAttribute("name");
            model.addAttribute("name", principalName);
        }
        return "home";
    }
}
