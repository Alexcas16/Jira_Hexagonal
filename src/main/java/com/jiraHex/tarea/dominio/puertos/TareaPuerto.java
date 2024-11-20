package com.jiraHex.tarea.dominio.puertos;

import com.jiraHex.tarea.dominio.modelos.Tarea;

public interface TareaPuerto {

	Tarea obtenerTareaPorId(Long id);
	
	void crearTarea(Tarea t);
	
}
