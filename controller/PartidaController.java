package com.meli.apipartida.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("partida")
public class PartidaController {

    @GetMapping
    public String criarPartida(){
        return "Priemro teste de msg";
    }
}
