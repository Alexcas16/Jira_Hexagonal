DROP TABLE IF EXISTS tareas;

CREATE TABLE tareas (
    id UUID PRIMARY KEY,
    tarea_id BIGINT,
    titulo VARCHAR(255) NOT NULL,
    descripcion TEXT,
    estado VARCHAR(50) NOT NULL,
    prioridad INT,
    fecha_entrega DATE
);