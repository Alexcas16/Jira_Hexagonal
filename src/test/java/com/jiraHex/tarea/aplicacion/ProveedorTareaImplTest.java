package com.jiraHex.tarea.aplicacion;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.jiraHex.tarea.apliacion.ProveedorTareaImpl;
import com.jiraHex.tarea.dominio.Enums.EnumEstado;
import com.jiraHex.tarea.dominio.modelos.Tarea;
import com.jiraHex.tarea.dominio.puertos.TareaPuerto;

public class ProveedorTareaImplTest {

	@Mock
	private TareaPuerto tareaPuerto;
	
	@InjectMocks
    private ProveedorTareaImpl proveedorTarea;

    public ProveedorTareaImplTest() {
        MockitoAnnotations.openMocks(this);
    }
    
    @Test
    void obtenerTareaPorId() {
    	Tarea tarea = new Tarea(
    			1L,
    			"tarea de prueba",
    			"tarea de prueba",
    			EnumEstado.PENDIENTE,
    			0,
    			null
    	);
    	
        when(tareaPuerto.obtenerTareaPorId(1L)).thenReturn(tarea);

        Tarea tareaObtenida = proveedorTarea.obtenerTareaPorId(1L);

        assertEquals("tarea de prueba", tareaObtenida.getTitulo());
        assertEquals("tarea de prueba", tareaObtenida.getDescripcion());
        assertEquals(EnumEstado.PENDIENTE, tareaObtenida.getEstado());
        assertEquals(0, tareaObtenida.getPrioridad());
        assertEquals(null, tareaObtenida.getFechaEntrega());
        
        verify(tareaPuerto, times(1)).obtenerTareaPorId(1L);
        
        String verde = "\u001B[32m";
        String reset = "\u001B[0m";
        System.out.println(verde + "[TEST][ProveedorTareaTest][obtenerTareaPorId]: Pasado." + reset);
    }
}
