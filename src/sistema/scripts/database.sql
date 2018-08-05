/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  jramos
 * Created: Jul 28, 2018
 */

CREATE DATABASE sistema_tiquetes;

CREATE TABLE sistema_tiquetes.tbl_area (
    codigoArea VARCHAR(10),
    nombre VARCHAR(35),
    PRIMARY KEY (codigoArea)
);

CREATE TABLE sistema_tiquetes.tbl_cliente (
    codigoCliente VARCHAR(10),
    nombre VARCHAR(35),
    apellido VARCHAR(35),
    PRIMARY KEY (codigoCliente)
);

CREATE TABLE sistema_tiquetes.tbl_departamento (
    codigoDepartamento VARCHAR(10),
    nombre VARCHAR(35),
    codigoArea VARCHAR(10),
    PRIMARY KEY (codigoDepartamento),
    FOREIGN KEY (codigoArea) REFERENCES tbl_area(codigoArea)
);

CREATE TABLE sistema_tiquetes.tbl_empleado (
    codigoEmpleado VARCHAR(10),
    nombre VARCHAR(35),
    apellido VARCHAR(35),
    codigoDepartamento VARCHAR(10),
    PRIMARY KEY (codigoEmpleado),
    FOREIGN KEY (codigoDepartamento) REFERENCES tbl_departamento(codigoDepartamento)
);

CREATE TABLE sistema_tiquetes.tbl_tiquete (
    codigoTiquete VARCHAR(10) PRIMARY KEY,
    fechaCreacion DATE,
    fechaSolucion DATE,
    descripcion VARCHAR(100),
    solucion VARCHAR(100),
    estado VARCHAR(35),
    codigoCliente VARCHAR(10),
    PRIMARY KEY (codigoTiquete),
    FOREIGN KEY (codigoCliente) REFERENCES tbl_cliente(codigoCliente)
);

CREATE TABLE sistema_tiquetes.tbl_incidencia (
    codigoIncidencia VARCHAR(10),
    descripcion VARCHAR(100),
    precioUnitario INT,
    codigoTiquete VARCHAR(10),
    PRIMARY KEY (codigoIncidencia),
    FOREIGN KEY (codigoTiquete) REFERENCES tbl_tiquete(codigoTiquete)
);
