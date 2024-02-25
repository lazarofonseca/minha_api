package com.lazaro.api.domain.repository;

import com.lazaro.api.domain.model.Socio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocioRepository extends JpaRepository<Socio, Long> {
}
