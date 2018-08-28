/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  jramos
 * Created: Ago 23, 2018
 */

CREATE TABLE tbl_area (
    codigoArea INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(35),
    PRIMARY KEY (codigoArea)
);

CREATE TABLE tbl_cliente (
    codigoCliente INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(35),
    apellido VARCHAR(35),
    username VARCHAR(30),
    password VARCHAR(30),
    PRIMARY KEY (codigoCliente)
);

CREATE TABLE tbl_departamento (
    codigoDepartamento INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(35),
    codigoArea INT,
    PRIMARY KEY (codigoDepartamento),
    FOREIGN KEY (codigoArea) REFERENCES tbl_area(codigoArea)
);

CREATE TABLE tbl_empleado (
    codigoEmpleado INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(35),
    apellido VARCHAR(35),
    codigoDepartamento INT,
    username VARCHAR(30),
    password VARCHAR(30),
    PRIMARY KEY (codigoEmpleado),
    FOREIGN KEY (codigoDepartamento) REFERENCES tbl_departamento(codigoDepartamento)
);

CREATE TABLE tbl_tiquete (
    codigoTiquete INT NOT NULL AUTO_INCREMENT,
    fechaCreacion DATE,
    fechaSolucion DATE,
    descripcion VARCHAR(100),
    solucion VARCHAR(100),
    estado VARCHAR(35),
    codigoCliente INT,
    titulo VARCHAR(30),
    categoria VARCHAR(30),
    tipo VARCHAR(30),
    prioridad VARCHAR(30),
    PRIMARY KEY (codigoTiquete),
    FOREIGN KEY (codigoCliente) REFERENCES tbl_cliente(codigoCliente)
);

CREATE TABLE tbl_incidencia (
    codigoIncidencia INT NOT NULL AUTO_INCREMENT,
    descripcion VARCHAR(100),
    precioUnitario INT,
    codigoTiquete INT,
    tipo VARCHAR(20),
    categoria VARCHAR(20),
    urgencia VARCHAR(10),
    seguimiento VARCHAR(10),
    titulo VARCHAR(50),
    PRIMARY KEY (codigoIncidencia),
    FOREIGN KEY (codigoTiquete) REFERENCES tbl_tiquete(codigoTiquete)
);

CREATE TABLE tbl_login (
    codigoRegistro INT NOT NULL AUTO_INCREMENT,
    password VARCHAR(30),
    username VARCHAR(30),
    fechaIngreso DATE,
    PRIMARY KEY (codigoRegistro)
);
