package com.jiraHex.tarea.infraestructura.database.mongobd.mappers;

import com.jiraHex.tarea.dominio.modelos.Tarea;
import com.jiraHex.tarea.infraestructura.database.mongobd.entidades.MongoTareaEntity;

public class TareaMongoEntityMapper {

	public static Tarea fromMongoEntityToTarea(MongoTareaEntity tareaEntity) {
        return new Tarea(
           tareaEntity.getTareaId(),
           tareaEntity.getTitulo(),
           tareaEntity.getDescripcion(),
           tareaEntity.getEstado(),
           tareaEntity.getPrioridad(),
           tareaEntity.getFechaEntrega()
        );
    }
	 
	public static MongoTareaEntity fromTareaToEntity(Tarea tarea) {
	    return new MongoTareaEntity(
    		tarea.getTareaId(),
    		tarea.getTitulo(),
    		tarea.getDescripcion(),
    		tarea.getEstado(),
    		tarea.getPrioridad(),
	       tarea.getFechaEntrega()
	    );
	}
	
}
