package com.Harold.backpersonas.repository;

import com.Harold.backpersonas.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
