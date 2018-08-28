/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  jramos
 * Created: Aug 27, 2018
 */

-- Crear Areas
INSERT INTO tbl_area (
    nombre, codigoArea
) VALUES (
    "Administrativa", 1
);
INSERT INTO tbl_area (
    nombre, codigoArea
) VALUES (
    "Financiera", 2
);
INSERT INTO tbl_area (
    nombre, codigoArea
) VALUES (
    "Ingenieria", 3
);

-- Crear clientes
INSERT INTO tbl_cliente (
    codigoCliente, nombre,
    apellido, username, password
) VALUES (
    1, "Daniel", "Solano", "dsolano", "1234"
);
INSERT INTO tbl_cliente (
    codigoCliente, nombre,
    apellido, username, password
) VALUES (
    2, "Vanessa", "Mora", "vmora", "1234"
);
INSERT INTO tbl_cliente (
    codigoCliente, nombre,
    apellido, username, password
) VALUES (
    3, "Jesus", "Ramos", "jramos", "1234"
);

-- Crear departamentos
INSERT INTO tbl_departamento (
    nombre, codigoDepartamento, codigoArea
) VALUES (
    "Contaduria", 1, 1
);
INSERT INTO tbl_departamento (
    nombre, codigoDepartamento, codigoArea
) VALUES (
    "Recursos Humanos", 2, 1
);
INSERT INTO tbl_departamento (
    nombre, codigoDepartamento, codigoArea
) VALUES (
    "Ventas", 3, 2
);
INSERT INTO tbl_departamento (
    nombre, codigoDepartamento, codigoArea
) VALUES (
    "Tecnologias de Informacion", 4, 3
);

-- Crear empleados
INSERT INTO tbl_empleado (
    nombre, apellido, codigoEmpleado, codigoDepartamento, 
    username, password
) VALUES (
    "Daniel", "Solano", 1, 1, "e_dsolano", "1234"
);
INSERT INTO tbl_empleado (
    nombre, apellido, codigoEmpleado, codigoDepartamento, 
    username, password
) VALUES (
    "Vanessa", "Mora", 2, 3, "e_vmora", "1234"
);
INSERT INTO tbl_empleado (
    nombre, apellido, codigoEmpleado, codigoDepartamento, 
    username, password
) VALUES (
    "Jesus", "Ramos", 3, 4, "e_jramos", "1234"
);

-- Crear tiquetes
INSERT INTO tbl_tiquete (
    codigoTiquete, fechaCreacion, fechaSolucion, descripcion, 
    solucion, estado, codigoCliente, titulo, categoria, tipo, prioridad
) VALUES (
    1, "2018-07-21", "2018-07-29", "Problemas con windows",
    "Reinstalar el programa", "Completado", 1, "Windows se cerro solo",
    "Software", "Incidente", "Media"
);
INSERT INTO tbl_tiquete (
    codigoTiquete, fechaCreacion, fechaSolucion, descripcion, 
    solucion, estado, codigoCliente, titulo, categoria, tipo, prioridad
) VALUES (
    2, "2018-07-24", "2018-07-24", "Telefono roto",
    "", "Completado", 2, "Las teclas no funcionan",
    "Hardware", "Incidente", "Media"
);

-- Crear incidencias
INSERT INTO tbl_incidencia (
    codigoIncidencia, descripcion, precioUnitario, codigoTiquete, 
    tipo, categoria, urgencia, seguimiento, titulo
) VALUES (
    1, "Ejecutar al tener errores de licencia", 3000, 1, "Soporte",
    "Instalaciones", "Media", "Completado", "Reinstalación Windows"
);
