package br.com.danichs.projetomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Hello{

    @GetMapping("/hello")
    public String getHello(HttpServletRequest request) {
        request.setAttribute("nome", "Mundo");
        return "hello";
    }

}
