package com.aceleradora.calculadora.services;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculadoraServiceTest {

    private CalculadoraService service;

    @Before
    public void configuracao() {
        service = new CalculadoraService();
    }

    @Test
    public void soma_dois_numeros_e_converte_o_resultado_para_string() {
        String resultado = service.soma(1, 1);

        assertThat(resultado, is("2"));
    }
}