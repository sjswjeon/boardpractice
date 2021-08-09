package com.example.boardpractice.controller;

import com.example.boardpractice.model.User;
import com.example.boardpractice.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/signin")
    public String signIn() {
        return "account/signin";
    }

    @GetMapping("/register")
    public String register() {
        return "account/register";
    }

    @PostMapping("/register")
    public String signUp(User user) {
        boardService.save(user);
        return "redirect:/";
    }
}