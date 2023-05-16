package com.Harold.backpersonas.repository;

import com.Harold.backpersonas.models.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

    List<Estado> getAll();

    Optional<Estado> getEstadoByName(String nombre);
    Optional<Estado> getEstadoById(Integer id);
    Estado save(Estado estado);
    void delete(String nombre);
}
