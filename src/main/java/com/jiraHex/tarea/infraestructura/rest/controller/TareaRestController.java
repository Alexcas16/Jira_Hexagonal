package com.jiraHex.tarea.infraestructura.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiraHex.comun.TareaDTo;
import com.jiraHex.comun.exceptions.TareaYaExisteException;
import com.jiraHex.tarea.apliacion.IProveedorTarea;
import com.jiraHex.tarea.infraestructura.rest.mapper.TareaDToMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/hexagonal/tareas")
@RestController
public class TareaRestController {

	private final IProveedorTarea proveedorTarea;
	
	@GetMapping("/{tareaId}")
    public TareaDTo obtenerTareaPorId(@PathVariable String tareaId) {
		Long tareaIdLong = Long.valueOf(tareaId);
        return TareaDToMapper.fromTareaToDTo(proveedorTarea.obtenerTareaPorId(tareaIdLong));
    }
	
	@GetMapping
    public List<TareaDTo> obtenerTodasLasTareas() {
        return proveedorTarea.obtenerTodasLasTareas().stream()
                .map(TareaDToMapper::fromTareaToDTo)
                .toList();
    }
	
	@PostMapping("/crearTarea")
    public ResponseEntity<TareaDTo> crearTarea(@RequestBody TareaDTo tareaDTO) throws TareaYaExisteException {		
        proveedorTarea.crearTarea(TareaDToMapper.fromDToToTarea(tareaDTO));
        return ResponseEntity.status(HttpStatus.CREATED).body(tareaDTO);
    }
	
	@PostMapping("/eliminarTareaPorId/{tareaId}")
    public ResponseEntity<Boolean> eliminarTareaPorId(@PathVariable String tareaId) {
		Long tareaIdLong = Long.valueOf(tareaId);
		proveedorTarea.eliminarTareaPorId(tareaIdLong);
		return ResponseEntity.status(HttpStatus.OK).body(true);
    }
	
}
