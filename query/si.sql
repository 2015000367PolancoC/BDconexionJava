drop database if exists bd_alumnos;
create database bd_alumnos;
use bd_alumnos;

create table alumnos(
	codigo varchar(50),
    seccion varchar(50),
    materia varchar(50),
    grado varchar(50)
);