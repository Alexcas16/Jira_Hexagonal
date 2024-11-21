package com.jiraHex.tarea.dominio.puertos;

import java.util.List;

import com.jiraHex.tarea.dominio.modelos.Tarea;

public interface TareaPuerto {

	Tarea obtenerTareaPorId(Long id);
	
	void crearTarea(Tarea t);
	
	List<Tarea> obtenerTodasLasTareas();
	
}
