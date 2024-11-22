package com.jiraHex.tarea.infraestructura.database.h2.entidades;

import java.time.LocalDate;
import java.util.UUID;

import com.jiraHex.tarea.dominio.Enums.EnumEstado;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
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
    @Column(name = "id")
    private UUID id;

    @Column(name = "tarea_id")
    @NotNull
    private Long tareaId;

    @Column(name = "titulo")
    @NotNull
    private String titulo;

    @Column(name = "descripcion")
    @NotNull
    private String descripcion;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "estado", nullable = false)
    @NotNull
    private EnumEstado estado;

    @Column(name = "prioridad")
    @NotNull
    private Integer prioridad;

    @Column(name = "fecha_entrega")
    @NotNull
    private LocalDate fechaEntrega;
	
	public TareaEntity(Long tareaId, String titulo, String descripcion, EnumEstado estado, Integer prioridad, LocalDate fechaEntrega) {
        this.tareaId = tareaId;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.fechaEntrega = fechaEntrega;
    }

}
