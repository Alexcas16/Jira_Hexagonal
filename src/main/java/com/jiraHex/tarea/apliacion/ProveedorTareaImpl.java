package com.jiraHex.tarea.apliacion;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.jiraHex.comun.exceptions.TareaYaExisteException;
import com.jiraHex.tarea.dominio.modelos.Tarea;
import com.jiraHex.tarea.dominio.puertos.TareaPuerto;

@Component
public class ProveedorTareaImpl implements IProveedorTarea {

	private final TareaPuerto tareaPuerto;
	
	/*
	 * PARA SQL:@Qualifier("TareaRepositorioAdaptador")
	 * PARA MONGO: @Qualifier("tareaMongoRepositorioAdaptador")
	 */
    public ProveedorTareaImpl(@Qualifier("tareaMongoRepositorioAdaptador") TareaPuerto tareaPuerto) {
        this.tareaPuerto = tareaPuerto;
    }
	
	@Override
	public Tarea obtenerTareaPorId(Long id) {
		return tareaPuerto.obtenerTareaPorId(id);
	}
	
	@Override
	public List<Tarea> obtenerTodasLasTareas() {
		return tareaPuerto.obtenerTodasLasTareas();
	}

	@Override
	public void crearTarea(Tarea t) throws TareaYaExisteException {
		try {
			this.obtenerTareaPorId(t.getTareaId());
			throw new TareaYaExisteException("Ya existe una tarea con el id: " + t.getTareaId());
			
		} catch (NoSuchElementException e) { // SOLO CREAMOS SI NO EXISTE
			tareaPuerto.crearTarea(t);
		}
	}

	@Override
	public void eliminarTareaPorId(Long id) {
		try {
			this.obtenerTareaPorId(id); // SI NO EXISTE, NO INTENTO ELIMINARLA
			tareaPuerto.eliminarTareaPorId(id);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void prueba(Long id) {
		// TODO Auto-generated method stub
		
	}

}
