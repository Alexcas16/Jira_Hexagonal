package com.jiraHex.tarea.infraestructura.database.h2.respositorio;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jiraHex.tarea.infraestructura.database.h2.entidades.TareaEntity;

@Repository
public interface TareaJpaRespositorio extends JpaRepository<TareaEntity, UUID>{
	
	 @Query("SELECT t FROM TareaEntity t WHERE t.tareadId = :id")
	 Optional<TareaEntity> obtenerTareaPorId(@Param("id") Long id);
}
