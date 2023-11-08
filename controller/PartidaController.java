package com.meli.apipartida.controller;


import com.meli.apipartida.dto.PartidaDto;
import com.meli.apipartida.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("partida")
public class PartidaController {

    @Autowired
   private PartidaService partidaService;

    @GetMapping
    public List<PartidaDto> listarPartida(){
        return partidaService.listarPardidar();
    }

    @PostMapping
    public String salvarPartida(@RequestBody PartidaDto partidaDto){
        return partidaService.salvarPartida(partidaDto);
    }



}
