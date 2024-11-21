package com.jiraHex.tarea.apliacion;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jiraHex.tarea.dominio.modelos.Tarea;
import com.jiraHex.tarea.dominio.puertos.TareaPuerto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class ProveedorTareaImpl implements IProveedorTarea {

	private final TareaPuerto tareaPuerto;
	
	@Override
	public Tarea obtenerTareaPorId(Long id) {
		return tareaPuerto.obtenerTareaPorId(id);
	}
	
	@Override
	public List<Tarea> obtenerTodasLasTareas() {
		return tareaPuerto.obtenerTodasLasTareas();
	}

	@Override
	public void crearTarea(Tarea t) {
		tareaPuerto.crearTarea(t);
	}

}
