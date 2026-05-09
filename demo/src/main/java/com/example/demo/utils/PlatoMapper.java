package com.example.demo.utils;


import com.example.demo.domain.entity.Plato;
import com.example.demo.dto.request.PlatoRequestDTO;
import com.example.demo.dto.response.PlatoResponseDTO;

public class PlatoMapper {

    public static Plato toEntity(PlatoRequestDTO request) {
        return Plato.builder()
                .nombre(request.nombre())
                .descripcion(request.descripcion())
                .precio(request.precio())
                .disponible(request.disponible())
                .build();
    }

    public static PlatoResponseDTO toResponse(Plato plato) {
        return new PlatoResponseDTO(
                plato.getId(),
                plato.getNombre(),
                plato.getPrecio(),
                plato.getDisponible()
        );
    }
}