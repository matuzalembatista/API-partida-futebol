package com.meli.apipartida.repository;

import com.meli.apipartida.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidaRepository extends JpaRepository<Partida, String> {
}
