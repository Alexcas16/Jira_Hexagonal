package com.jiraHex.tarea.infraestructura.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiraHex.comun.TareaDTo;
import com.jiraHex.tarea.apliacion.IProveedorTarea;
import com.jiraHex.tarea.dominio.puertos.TareaPuerto;
import com.jiraHex.tarea.infraestructura.rest.mapper.TareaDToMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/hexagonal/products")
@RestController
public class TareaRestController {

	private final IProveedorTarea proveedorTarea;
	
	@GetMapping("/{productId}")
    public TareaDTo obtenerTareaPorId(@PathVariable String tareaId) {
		Long tareaIdLong = Long.valueOf(tareaId);
        return TareaDToMapper.fromTareaToDTo(proveedorTarea.obtenerTareaPorId(tareaIdLong));
    }
	
}
