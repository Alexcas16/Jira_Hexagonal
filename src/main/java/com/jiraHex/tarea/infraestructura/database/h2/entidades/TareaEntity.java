package com.jiraHex.tarea.infraestructura.database.h2.entidades;

import java.time.LocalDate;
import java.util.UUID;

import com.jiraHex.tarea.dominio.Enums.EnumEstado;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tareas")
public class TareaEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
	private Long tareadId;
	private String titulo;
	private String descripcion;
	@Enumerated(value = EnumType.STRING)
	private EnumEstado estado;
	private Integer prioridad;
	private LocalDate fechaEntrega;
	
	public TareaEntity(Long tareaId, String titulo, String descripcion, EnumEstado estado, Integer prioridad, LocalDate fechaEntrega) {
        this.tareadId = tareaId;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.fechaEntrega = fechaEntrega;
    }

	
}
