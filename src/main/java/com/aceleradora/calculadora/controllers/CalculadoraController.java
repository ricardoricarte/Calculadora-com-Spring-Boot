package com.aceleradora.calculadora.controllers;

import com.aceleradora.calculadora.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculadoraController {

    private final CalculadoraService service;

    @Autowired
    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @PostMapping("/soma")
    @ResponseBody
    public String soma(int primeiroValor, int segundoValor) {
        return service.soma(primeiroValor, segundoValor);
    }
}
