CREATE TABLE IF NOT EXISTS Rol(
tipo VARCHAR(12) PRIMARY KEY);

CREATE TABLE IF NOT EXISTS Usuario(
  id NUMBER(12) NOT NULL,
  tid VARCHAR(2) NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  telefono NUMBER(12) NOT NULL,
  correo VARCHAR(50) NOT NULL,
  clave VARCHAR(20) NOT NULL,
  estado VARCHAR(15) NOT NULL,
  rol VARCHAR(12) REFERENCES Rol(tipo),
  PRIMARY KEY (correo),
  UNIQUE KEY (telefono));