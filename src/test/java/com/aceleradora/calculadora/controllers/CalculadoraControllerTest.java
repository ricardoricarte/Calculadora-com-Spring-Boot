package com.aceleradora.calculadora.controllers;

import com.aceleradora.calculadora.services.CalculadoraService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraControllerTest {

    private CalculadoraController controller;

    @Mock
    private CalculadoraService service;

    @Before
    public void configuracao() {
       controller = new CalculadoraController(service);
    }

    @Test
    public void usa_o_service_para_somar_os_numeros() {
        when(service.soma(1, 1)).thenReturn("2");

        String resultado = controller.soma(1, 1);

        assertThat(resultado, is("2"));
    }
}