--CREAR UN DDL
CREATE TABLE COMPUTADORA_PRD(
   ID_COMPU NUMBER,
   MARCA NVARCHAR2(100),
   MODELO NVARCHAR2(100),
   RAM NUMBER,
   PROCESADOR NVARCHAR2(100),
   PRECIO NUMBER,
   CONSTRAINT COMPU_PRD_PK PRIMARY KEY(ID_COMPU)
);

SELECT * FROM COMPUTADORA;
DELETE COMPUTADORA;
INSERT INTO COMPUTADORA VALUES(1, 'DELL', 'INSPIRON', 16, 'INTEL CORE i5', 110000);
INSERT INTO COMPUTADORA VALUES(2, 'LENOVO', 'THINK PAD', 32, 'INTEL CORE i3', 12000);
INSERT INTO COMPUTADORA VALUES(3, 'HP', 'INPIRON', 8, 'TYZEN 3', 7859);
INSERT INTO COMPUTADORA VALUES(4, 'AZUS', 'VIVO', 16, 'INTEL CORE i3 12TH', 9159);
INSERT INTO COMPUTADORA VALUES(5,'OCELOT','RAMSTER',10,'INTEL CORE i5',17859);
INSERT INTO COMPUTADORA VALUES(6, 'MACK', 'MACBOOKAIR', 16,'CORE I5', 30000);
INSERT INTO COMPUTADORA VALUES(7, 'TOSHIBA', 'NB350', 8, 'CORE 5', 15000);
INSERT INTO COMPUTADORA VALUES(8, 'TOSHIBA',16, 'RITZEN 5' ,16, 75000);
COMMIT;

--HACER UN PROCEDIMIENTO ALMACENADO CON SENTENCIA TIPO INT SELECT

CREATE OR REPLACE PROCEDURE PR_RESPALDO_COMPUTADORA
IS
--DECLARACION DE VARIABLES CONSTANTES O CURSORES
BEGIN
   --INSTRUCCONES A EJECUTAR
  --ELIMINAR TODA MI TABLA COMPUTADORA_PRD
  DELETE FROM COMPUTADORA_PRD;
  
  --REALIZAR EL RESPALDO DE COMPUTADORA EN COMPUTADORA_PRD
  INSERT INTO COMPUTADORA_PRD(ID_COMPU, MARCA, MODELO, RAM, PROCESADOR, PRECIO)
  SELECT ID_COMPU, MARCA, MODELO, RAM, PROCESADOR, PRECIO FROM COMPUTADORA;
END PR_RESPALDO_COMPUTADORA;
/

SELECT * FROM COMPUTADORA;
SELECT * FROM COMPUTADORA_PRD;

-- EJECUTAR EL PROCEDIMIENTO ALMACENADO
EXECUTE PR_RESPALDO_COMPUTADORA;

-------------------------------
--PROCEDIMIENTO ALMACENADO PARA LA TABLA VIDEOJUEGO
 CREATE TABLE VIDEOJUEGO_PRD(
       ID_JUEGO NUMBER,
       NOMBRE NVARCHAR2(100),
       CATEGORIA NVARCHAR2(100),
       COSTO NUMBER,
       CONSTRAINT JUEGO_PRD_PK PRIMARY KEY(ID_JUEGO)
);
     INSERT INTO VIDEOJUEGO VALUES(1, 'GOD OF WAR', 'C', 1599); 
     INSERT INTO VIDEOJUEGO VALUES(2, 'TLOU', 'B', 1299); 
     INSERT INTO VIDEOJUEGO VALUES(3, 'MARIO', 'A', 700);
     INSERT INTO VIDEOJUEGO VALUES(4, 'WAR ZONE', 'B+', 199); 
     INSERT INTO VIDEOJUEGO VALUES(5, 'HORIZON', 'B', 1299); 
     INSERT INTO VIDEOJUEGO VALUES(6, 'FIFA', 'A', 500);
     COMMIT;
SELECT * FROM VIDEOJUEGO;

--PROCEDIMIENTO
CREATE OR REPLACE PROCEDURE PR_RESPALDO_VIDEOJUEGO
IS
 BEGIN
  DELETE FROM VIDEOJUEGO_PRD;
  INSERT INTO VIDEOJUEGO_PRD(ID_JUEGO, NOMBRE, CATEGORIA, COSTO)
  SELECT ID_JUEGO, NOMBRE, CATEGORIA, COSTO FROM VIDEOJUEGO;
END PR_RESPALDO_VIDEOJUEGO;
/
      ---- EJECUCION
SELECT * FROM VIDEOJUEGO_PRD;
DELETE FROM VIDEOJUEGO_PRD;
EXECUTE PR_RESPALDO_VIDEOJUEGO;


  