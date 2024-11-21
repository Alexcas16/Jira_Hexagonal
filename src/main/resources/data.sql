-- Insertar tareas de ejemplo
INSERT INTO tareas (id, tarea_id, titulo, descripcion, estado, prioridad, fecha_entrega)
VALUES 
    ('550e8400-e29b-41d4-a716-446655440000', 1, 'Configurar base de datos', 'Configurar la base de datos H2 en el proyecto', 'PENDIENTE', 1, '2024-11-25'),
    ('550e8400-e29b-41d4-a716-446655440001', 2, 'Crear migraciones', 'Generar los archivos SQL para migrar el esquema y datos iniciales', 'EN_PROGRESO', 2, '2024-11-30');