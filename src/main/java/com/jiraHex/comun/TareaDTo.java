package com.jiraHex.comun;

import java.time.LocalDate;

import com.jiraHex.tarea.dominio.Enums.EnumEstado;

import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class TareaDTo {

	@NotNull
	private Long tareaId;
	
	@NotNull
    private String titulo;
	
	@NotNull
	private String descripcion;
    
	@NotNull
	private EnumEstado estado;
    
	@NotNull
	private Integer prioridad;
    
	@NotNull
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
