package com.jiraHex.comun;

import java.time.LocalDate;

import com.jiraHex.tarea.dominio.Enums.EnumEstado;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class TareaDTo {

	private Long tareaId;
    private String titulo;
    private String descripcion;
    private EnumEstado estado;
    private Integer prioridad;
    private LocalDate fechaEntrega;
    
	public TareaDTo(Long tareaId, String titulo, String descripcion, EnumEstado estado, Integer prioridad,
			LocalDate fechaEntrega) {
		this.tareaId = tareaId;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.estado = estado;
		this.prioridad = prioridad;
		this.fechaEntrega = fechaEntrega;
	}
	
}
