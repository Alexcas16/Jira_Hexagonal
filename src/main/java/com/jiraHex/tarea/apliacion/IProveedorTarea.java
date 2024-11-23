package com.jiraHex.tarea.apliacion;

import java.util.List;

import com.jiraHex.comun.exceptions.TareaYaExisteException;
import com.jiraHex.tarea.dominio.modelos.Tarea;

public interface IProveedorTarea {

	Tarea obtenerTareaPorId(Long id);
	
	List<Tarea> obtenerTodasLasTareas();
	
	void crearTarea(Tarea t) throws TareaYaExisteException;
	
	void eliminarTareaPorId(Long id);
}
