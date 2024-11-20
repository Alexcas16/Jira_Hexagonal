package com.jiraHex.tarea.apliacion;

import com.jiraHex.tarea.dominio.modelos.Tarea;

public interface IProveedorTarea {

	Tarea obtenerTareaPorId(Long id);
	
}
