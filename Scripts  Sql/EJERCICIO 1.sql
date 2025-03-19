--DDL --> Lenguaje para definir y modificar la escritura de los objectos en la bd --> create, update, alter y drop
--DML --> Lenguaje de manipulacion de datos --> select, insert, update ydelete
--DCL --> lenguaje de control de datos -->grant, removeke

--Modificar la sesion actual para la ejecucion de scripst
ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;

-- CREACION DE UN NUEVO USUARIO
CREATE USER ENUCOM IDENTIFIED BY CURSO2025;

-- OTORGAR PRIVILEGIOS

GRANT ALL PRIVILEGES TO ENUCOM;