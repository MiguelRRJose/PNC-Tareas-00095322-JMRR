package com.example.demo.dto.response;


public record PlatoResponseDTO(
        Long id,
        String nombre,
        Double precio,
        Boolean disponible
) {
}