package com.jiraHex.tarea.infraestructura.database.h2.adaptadores;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Component;

import com.jiraHex.tarea.dominio.modelos.Tarea;
import com.jiraHex.tarea.dominio.puertos.TareaPuerto;
import com.jiraHex.tarea.infraestructura.database.h2.mappers.TareaEntityMapper;
import com.jiraHex.tarea.infraestructura.database.h2.respositorio.TareaJpaRespositorio;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class TareaRepositorioAdaptador implements TareaPuerto {

	private final TareaJpaRespositorio tareaJpaRespositorio;
	
	@Override
	public Tarea obtenerTareaPorId(Long id) {
		return tareaJpaRespositorio.obtenerTareaPorId(id)
		.map(TareaEntityMapper::fromEntityToTarea)
        .orElseThrow(() -> new NoSuchElementException("Tarea no encontrada"));
	}

	@Override
	public void crearTarea(Tarea t) {
		
	}

}
