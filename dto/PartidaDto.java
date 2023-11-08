package com.meli.apipartida.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PartidaDto {
    private int idPartida;

    private String clube;

    private int resultadoMandante;

    private int resultadoVisitante;

    private String estadio;

    private int horario;

    private int dia;


}
