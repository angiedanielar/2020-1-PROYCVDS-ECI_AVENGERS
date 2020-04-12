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
  UNIQUE KEY (id),
  UNIQUE KEY (telefono));

INSERT INTO Rol(tipo) VALUES ('Administrador');
INSERT INTO Rol(tipo) VALUES ('Proponente');
INSERT INTO Rol(tipo) VALUES ('Personal PMO');
INSERT INTO Rol(tipo) VALUES ('Publico');

INSERT INTO Usuario (id, tid, nombre, telefono, correo, clave, estado, rol) VALUES (1234, 'CC', 'Angi Jimenez', 9303130, 'angi.jimenez', 'Angie2000', 'Activo', 'Administrador');
INSERT INTO Usuario (id, tid, nombre, telefono, correo, clave, estado, rol) VALUES (12345, 'CC', 'Daniela Ruiz', 1019150998, 'angied.ruiz', 'Ruiz123', 'Activo', 'Proponente');
