package com.jiraHex.tarea.infraestructura.database.h2.mappers;

import com.jiraHex.tarea.dominio.modelos.Tarea;
import com.jiraHex.tarea.infraestructura.database.h2.entidades.TareaEntity;

public class TareaEntityMapper {

	 public static Tarea fromEntityToTarea(TareaEntity tareaEntity) {
        return new Tarea(
           tareaEntity.getTareadId(),
           tareaEntity.getTitulo(),
           tareaEntity.getDescripcion(),
           tareaEntity.getEstado(),
           tareaEntity.getPrioridad(),
           tareaEntity.getFechaEntrega()
        );
    }
}
