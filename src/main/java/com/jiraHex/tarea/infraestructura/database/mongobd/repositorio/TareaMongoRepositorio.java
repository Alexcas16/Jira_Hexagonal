package com.jiraHex.tarea.infraestructura.database.mongobd.repositorio;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.jiraHex.tarea.dominio.modelos.Tarea;
import com.jiraHex.tarea.infraestructura.database.mongobd.entidades.MongoTareaEntity;

public interface TareaMongoRepositorio extends MongoRepository<Tarea, String> {

	@Query("{ 'tarea_id' : ?0 }")
	Optional<MongoTareaEntity> obtenerTareaPorId(Long id);
	
}
