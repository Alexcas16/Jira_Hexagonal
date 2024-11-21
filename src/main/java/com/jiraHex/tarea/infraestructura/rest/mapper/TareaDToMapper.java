package com.jiraHex.tarea.infraestructura.rest.mapper;

import com.jiraHex.comun.TareaDTo;
import com.jiraHex.tarea.dominio.modelos.Tarea;

public class TareaDToMapper {

	public static TareaDTo fromTareaToDTo(Tarea tarea) {
        return new TareaDTo(
        		tarea.getTareaId(),
        		tarea.getTitulo(),
        		tarea.getDescripcion(),
        		tarea.getEstado(),
        		tarea.getPrioridad(),
        		tarea.getFechaEntrega()
        );
    }
	
	public static Tarea fromDToToTarea(TareaDTo tareaDTo) {
        return new Tarea(
        		tareaDTo.getTareaId(),
        		tareaDTo.getTitulo(),
        		tareaDTo.getDescripcion(),
        		tareaDTo.getEstado(),
        		tareaDTo.getPrioridad(),
        		tareaDTo.getFechaEntrega()
        );
    }
	
}
