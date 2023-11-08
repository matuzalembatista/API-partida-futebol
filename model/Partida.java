package com.meli.apipartida.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table

public class Partida {

    @Id
    @Column()
    private int idPartida;

    @Column
    private String clube;

    @Column
    private int resultadoMandante;

    @Column
    private int resultadoVisitante;

    @Column
    private String estadio;

    @Column
    private int horario;

    @Column
    private int dia;
    @Id
    private Long id;


}
