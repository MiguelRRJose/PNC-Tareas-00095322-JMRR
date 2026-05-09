package com.example.demo.controller;


import com.example.demo.dto.GeneralResponse;
import com.example.demo.dto.request.PlatoRequestDTO;
import com.example.demo.dto.response.PlatoResponseDTO;
import com.example.demo.service.impl.PlatoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/platos")
@RequiredArgsConstructor
public class PlatoController {

    private final PlatoServiceImpl platoService;

    @PostMapping
    public ResponseEntity<GeneralResponse> createPlato(@RequestBody PlatoRequestDTO request) {
        PlatoResponseDTO response = platoService.createPlato(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(GeneralResponse.builder()
                        .data(response)
                        .message("Plato creado exitosamente")
                        .build());
    }

    @GetMapping
    public ResponseEntity<GeneralResponse> getAllPlatos() {
        List<PlatoResponseDTO> response = platoService.getAllPlatos();
        return ResponseEntity.ok(GeneralResponse.builder()
                .data(response)
                .message("Platos obtenidos exitosamente")
                .build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GeneralResponse> getPlatoById(@PathVariable Long id) {
        PlatoResponseDTO response = platoService.getPlatoById(id);
        return ResponseEntity.ok(GeneralResponse.builder()
                .data(response)
                .message("Plato obtenido exitosamente")
                .build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<GeneralResponse> updatePlato(@PathVariable Long id, @RequestBody PlatoRequestDTO request) {
        PlatoResponseDTO response = platoService.updatePlato(id, request);
        return ResponseEntity.ok(GeneralResponse.builder()
                .data(response)
                .message("Plato actualizado exitosamente")
                .build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GeneralResponse> deletePlato(@PathVariable Long id) {
        platoService.deleteFlato(id);
        return ResponseEntity.ok(GeneralResponse.builder()
                .data(null)
                .message("Plato eliminado exitosamente")
                .build());
    }
}