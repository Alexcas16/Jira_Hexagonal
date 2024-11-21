package com.jiraHex.tarea.apliacion;

import java.util.List;

import com.jiraHex.tarea.dominio.modelos.Tarea;

public interface IProveedorTarea {

	Tarea obtenerTareaPorId(Long id);
	
	List<Tarea> obtenerTodasLasTareas();
	
	void crearTarea(Tarea t);
	
}
