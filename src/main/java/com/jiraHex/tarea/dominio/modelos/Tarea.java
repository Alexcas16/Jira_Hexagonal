package com.jiraHex.tarea.dominio.modelos;

import java.time.LocalDate;

import com.jiraHex.tarea.dominio.Enums.EnumEstado;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Tarea {
	
    @NotNull(message = "El ID de la tarea no puede ser nulo.")
    private Long tareaId;

    @NotNull(message = "El título no puede ser nulo.")
    @Size(max = 50, message = "El título no puede tener más de 50 caracteres.")
    private String titulo;

    @NotNull
    @Size(max = 1000, message = "La descripción no puede tener más de 1000 caracteres.")
    private String descripcion;

    @NotNull(message = "El estado no puede ser nulo.")
    private EnumEstado estado;

    @NotNull
    @Min(value = 0, message = "La prioridad no puede ser menor que 0.")
    @Max(value = 5, message = "La prioridad no puede ser mayor que 5.")
    private Integer prioridad;

    @NotNull(message = "La fecha de entrega no puede ser nula.")
    @FutureOrPresent(message = "La fecha de entrega no puede estar en el pasado.")
    private LocalDate fechaEntrega;
	
}
