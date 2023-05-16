package com.Harold.backpersonas.service;

import com.Harold.backpersonas.models.Estado;
import com.Harold.backpersonas.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService implements EstadoRepository {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<Estado> getAll() {
        return estadoRepository.getAll();
    }

    @Override
    public Optional<Estado> getEstadoById(Integer id) {
        return estadoRepository.getEstadoById(Integer id);
    }

    @Override
    public Optional<Estado> getEstadoByName(String nombre) {
        return estadoRepository.getEstadoByName(String nombre);
    }
}
