//creacion de la secuencia que colocara de forma automatica un id a cada insercion 
CREATE SEQUENCE Cajero_id
START WITH 1 
MAXVALUE 9999
MINVALUE 1
NOCYCLE;
/

DROP SEQUENCE Cajero_id;

//creacion de un trigger para aplicar la secuencia previamente creada 
CREATE OR REPLACE TRIGGER Cajero_id_In
BEFORE INSERT ON Cajero
FOR EACH ROW
BEGIN
    SELECT Cajero_id.NEXTVAL
    INTO :NEW.id
    FROM dual;
END;
/

// creacion de tabla 
drop table Cajero;
create table Cajero(
    id INT  ,
    tipo NVARCHAR2(50),
    cantidad INT ,
    denominacion number, 
    CONSTRAINT cajero_pk PRIMARY KEY(id)
);

//insercion de datos
insert into Cajero(tipo, cantidad, denominacion) values('Billete', 2, 1000);
insert into Cajero(tipo, cantidad, denominacion) values('Billete', 5, 500);
insert into Cajero(tipo, cantidad, denominacion) values('Billete', 10, 200);
insert into Cajero(tipo, cantidad, denominacion) values('Billete', 20, 100);
insert into Cajero(tipo, cantidad, denominacion) values('Billete', 30, 50);
insert into Cajero(tipo, cantidad, denominacion) values('Billete', 40, 20);
commit;
select * from Cajero; 
insert into Cajero(tipo, cantidad, denominacion) values('Moneda', 50, 10);
insert into Cajero(tipo, cantidad, denominacion) values('Moneda', 100, 5);
insert into Cajero(tipo, cantidad, denominacion) values('Moneda', 200, 2);
insert into Cajero(tipo, cantidad, denominacion) values('Moneda', 300, 1);
insert into Cajero(tipo, cantidad, denominacion) values('Moneda', 100, 0.50);
commit;
select * from Cajero;
select to_char(sum(cantidad*denominacion), '$00,000.00')||' MXN' as cantidad from Cajero;

