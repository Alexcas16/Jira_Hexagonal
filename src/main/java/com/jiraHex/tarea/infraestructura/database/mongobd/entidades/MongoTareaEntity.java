package com.jiraHex.tarea.infraestructura.database.mongobd.entidades;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.jiraHex.tarea.dominio.Enums.EnumEstado;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "tareas")
public class MongoTareaEntity {

	@Id
	private String id;

    @Field("tarea_id")
    @NotNull
    private Long tareaId;

    @Field("titulo")
    @NotNull
    private String titulo;

    @Field("descripcion")
    @NotNull
    private String descripcion;

    @Field("estado")
    @NotNull
    private EnumEstado estado;

    @Field("prioridad")
    @NotNull
    private Integer prioridad;

    @Field("fecha_entrega")
    @NotNull
    private LocalDate fechaEntrega;
    
    public MongoTareaEntity(Long tareaId, String titulo, String descripcion, EnumEstado estado, Integer prioridad, LocalDate fechaEntrega) {
        this.tareaId = tareaId;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.fechaEntrega = fechaEntrega;
    }
	
}
