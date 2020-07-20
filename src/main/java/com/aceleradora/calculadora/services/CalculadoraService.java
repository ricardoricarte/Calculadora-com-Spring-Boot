package com.aceleradora.calculadora.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public String soma(int primeiroValor, int segundoValor) {
        return Integer.toString(primeiroValor + segundoValor);
    }
}
