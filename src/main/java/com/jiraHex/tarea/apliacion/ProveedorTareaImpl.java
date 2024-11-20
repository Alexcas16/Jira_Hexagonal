package com.jiraHex.tarea.apliacion;

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

}
