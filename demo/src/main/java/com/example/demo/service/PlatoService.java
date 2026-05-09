package com.example.demo.service;


import com.example.demo.dto.request.PlatoRequestDTO;
import com.example.demo.dto.response.PlatoResponseDTO;

import java.util.List;

public interface PlatoService {
    PlatoResponseDTO createPlato(PlatoRequestDTO request);
    List<PlatoResponseDTO> getAllPlatos();
    PlatoResponseDTO getPlatoById(Long id);
    PlatoResponseDTO updatePlato(Long id, PlatoRequestDTO request);
    void deleteFlato(Long id);
}