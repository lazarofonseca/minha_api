package com.lazaro.api.controller;

import com.lazaro.api.domain.model.Socio;
import com.lazaro.api.domain.repository.SocioRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/socios")
public class SocioController {

    private final SocioRepository socioRepository;

    @GetMapping
    public List<Socio> listar() {
        return socioRepository.findAll();
    }

}
