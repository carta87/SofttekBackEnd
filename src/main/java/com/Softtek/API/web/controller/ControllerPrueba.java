package com.Softtek.API.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class ControllerPrueba {

    @GetMapping("/hola")
    public String saludar(){
        return "nunca Dejes de aprender ";
    }
}
