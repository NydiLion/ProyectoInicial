CREATE DATABASE banrural;
USE banrural;
CREATE TABLE  boleta
(
numero_boleta int (12) primary key,
fecha_boleta date,
monto_boleta varchar(40),
descripcion_boleta varchar(50)
)engine=InnoDB default charset=latin1;

USE banrural;
Select * From boleta;