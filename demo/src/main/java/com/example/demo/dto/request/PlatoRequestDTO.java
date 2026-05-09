package com.example.demo.dto.request;

import lombok.Builder;

@Builder
public record PlatoRequestDTO(
        String nombre,
        String descripcion,
        Double precio,
        Boolean disponible
) {
}