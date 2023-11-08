package com.meli.apipartida.service;

import com.meli.apipartida.dto.PartidaDto;
import com.meli.apipartida.model.Partida;
import com.meli.apipartida.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartidaService {
    @Autowired
    private PartidaRepository partidaRepository;

    public List<PartidaDto> listarPartida(){
        List<Partida> listarDePartida = partidaRepository.findAll();

        return listarDePartida;
    }

    public String salvarPartida(PartidaDto partidaDto){
        Partida partida = new Partida();
        partida.setIdPartida(partida.getIdPartida());
        partida.setClube(partida.getClube());
        partida.setEstadio(partida.getEstadio());
        partida.setDia(partida.getDia());
        partida.setResultadoMandante(partida.getResultadoMandante());
        partida.setResultadoVisitante(partida.getResultadoVisitante());
        partida.setHorario(partida.getHorario());

        partidaRepository.save(partida);
        return "Partida SALVA!";



    }


}
