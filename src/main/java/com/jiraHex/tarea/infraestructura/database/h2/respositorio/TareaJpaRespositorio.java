package com.jiraHex.tarea.infraestructura.database.h2.respositorio;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiraHex.tarea.infraestructura.database.h2.entidades.TareaEntity;

@Repository
public interface TareaJpaRespositorio extends JpaRepository<TareaEntity, UUID>{
	Optional<TareaEntity> obtenerTareaPorId(Long tareaId);
}
