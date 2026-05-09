package com.example.demo.service.impl;


import com.example.demo.domain.entity.Plato;
import com.example.demo.dto.request.PlatoRequestDTO;
import com.example.demo.dto.response.PlatoResponseDTO;
import com.example.demo.repository.PlatoRepository;
import com.example.demo.service.PlatoService;
import com.example.demo.utils.PlatoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlatoServiceImpl implements PlatoService {

    private final PlatoRepository platoRepository;

    @Override
    public PlatoResponseDTO createPlato(PlatoRequestDTO request) {
        Plato plato = PlatoMapper.toEntity(request);
        platoRepository.save(plato);
        return PlatoMapper.toResponse(plato);
    }

    @Override
    public List<PlatoResponseDTO> getAllPlatos() {
        return platoRepository.findAll()
                .stream()
                .map(PlatoMapper::toResponse)
                .toList();
    }

    @Override
    public PlatoResponseDTO getPlatoById(Long id) {
        Plato plato = platoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Plato no encontrado con id: " + id));
        return PlatoMapper.toResponse(plato);
    }

    @Override
    public PlatoResponseDTO updatePlato(Long id, PlatoRequestDTO request) {
        Plato plato = platoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Plato no encontrado con id: " + id));
        plato.setNombre(request.nombre());
        plato.setDescripcion(request.descripcion());
        plato.setPrecio(request.precio());
        plato.setDisponible(request.disponible());
        platoRepository.save(plato);
        return PlatoMapper.toResponse(plato);
    }

    @Override
    public void deleteFlato(Long id) {
        platoRepository.deleteById(id);
    }
}