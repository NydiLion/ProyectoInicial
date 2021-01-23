CREATE DATABASE citas_migracion;
USE citas_migracion;

CREATE TABLE lugar_cita(
ID_lugar INTEGER PRIMARY KEY NOT NULL,
lugar_direccion VARCHAR(100) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE cita_pasaporte(
ID_Cita INTEGER PRIMARY KEY NOT NULL,
Fecha_Cita DATETIME NOT NULL,
Hora_Cita VARCHAR(6) NOT NULL,
cita_lugar INT NOT NULL,
FOREIGN KEY(cita_lugar) REFERENCES lugar_cita(ID_lugar) ON UPDATE CASCADE ON DELETE CASCADE
)ENGINE=InnoDB;

DROP TABLE lugar_cita;
DROP TABLE cita_pasaporte;