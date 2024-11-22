package com.jiraHex.tarea.infraestructura.database.mongobd.adaptadores;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Component;

import com.jiraHex.tarea.dominio.modelos.Tarea;
import com.jiraHex.tarea.dominio.puertos.TareaPuerto;
import com.jiraHex.tarea.infraestructura.database.mongobd.mappers.TareaMongoEntityMapper;
import com.jiraHex.tarea.infraestructura.database.mongobd.repositorio.TareaMongoRepositorio;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class TareaMongoRepositorioAdaptador implements TareaPuerto {
	
	private final TareaMongoRepositorio tareaMongoRepositorio;
	
	public Tarea obtenerTareaPorId(Long id) {
		return tareaMongoRepositorio.obtenerTareaPorId(id)
			.map(TareaMongoEntityMapper::fromMongoEntityToTarea)
	        .orElseThrow(() -> new NoSuchElementException("Tarea no encontrada"));
	}

	@Override
	public void crearTarea(Tarea t) {		
	}

	@Override
	public List<Tarea> obtenerTodasLasTareas() {
		return null;
	}

	@Override
	public void eliminarTareaPorId(Long id) {		
	}

}
