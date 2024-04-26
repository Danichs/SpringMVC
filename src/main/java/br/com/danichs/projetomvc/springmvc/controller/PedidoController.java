package br.com.danichs.projetomvc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @GetMapping("formulario")
    public String formulario() {
        return "pedido/formulario";
    }
    
}
