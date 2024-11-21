DROP TABLE IF EXISTS tareas;

CREATE TABLE tareas (
    id UUID PRIMARY KEY,
    taread_id BIGINT,
    titulo VARCHAR(255) NOT NULL,
    descripcion TEXT,
    estado VARCHAR(50) NOT NULL,
    prioridad INT,
    fecha_entrega DATE
);

-- Insertar tareas de ejemplo
INSERT INTO tareas (id, taread_id, titulo, descripcion, estado, prioridad, fecha_entrega)
VALUES 
    ('550e8400-e29b-41d4-a716-446655440000', 1, 'Configurar base de datos', 'Configurar la base de datos H2 en el proyecto', 'PENDIENTE', 1, '2024-11-25'),
    ('550e8400-e29b-41d4-a716-446655440001', 2, 'Crear migraciones', 'Generar los archivos SQL para migrar el esquema y datos iniciales', 'EN_PROGRESO', 2, '2024-11-30');