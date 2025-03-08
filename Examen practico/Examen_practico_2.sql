select * from equipos;
select * from jugadores;
select * from estadisticas;
select * from partidos;
-- 1.	Mostrar el nombre de todos los jugadores ordenados alfabéticamente. (Debe devolver 432 registros.)
select NOMBRE from jugadores ORDER BY NOMBRE ASC;

-- 2.	Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select NOMBRE from equipos ORDER BY NOMBRE ASC;

-- 3.	Mostrar el nombre de los equipos del este.
select NOMBRE from equipos where CONFERENCIA = 'East'; 

-- 4.	Mostrar los equipos donde su ciudad empieza por c.
select * from equipos where CUIDAD LIKE 'C%';

-- 5.	Mostrar todos los jugadores y su equipo ordenado por nombre del equipo. (Debe devolver 432 registros)
select NOMBRE_EQUIPO, NOMBRE from jugadores ORDER BY NOMBRE_EQUIPO ASC;

-- 6.	Mostrar todos los jugadores del equipo «Raptors».
select  * from jugadores where NOMBRE_EQUIPO = 'Raptors';

-- 7.	Mostrar los puntos por partido de ‘Pau Gasol’.
select j.NOMBRE, PUNTOS_LOCAL, PUNTOS_VISITANTE from partidos p full join equipos e on p.EQUIPO_LOCAL = E.NOMBRE 
FULL JOIN  jugadores j on e.NOMBRE = j.NOMBRE_EQUIPO where j.NOMBRE ='Pau Gasol';

-- 8.	Mostrar los puntos por partido de ‘Pau Gasol’ en la temporada ’04/05′.
select j.NOMBRE, PUNTOS_LOCAL, PUNTOS_VISITANTE from partidos p full join equipos e on p.EQUIPO_LOCAL = E.NOMBRE 
FULL JOIN  jugadores j on e.NOMBRE = j.NOMBRE_EQUIPO where j.NOMBRE ='Pau Gasol' and TEMPORADA='04/05';

-- 9.	Mostrar el número de puntos de cada jugador en toda su carrera. (Debe devolver 424 registros.)
select j.NOMBRE, SUM(PUNTOS_POR_PARTIDO) from estadisticas e LEFT join jugadores j on e.JUGADOR = j.CODIGO  group by NOMBRE ;

-- 10.	Mostrar el número de jugadores de cada equipo.
select NOMBRE_EQUIPO, count(CODIGO)as jugadores from jugadores group by NOMBRE_EQUIPO;

-- 11.	Mostrar el jugador que más puntos ha realizado en toda su carrera
select j.NOMBRE, SUM(e.PUNTOS_POR_PARTIDO)as puntos from jugadores j join estadisticas e on e.JUGADOR = j.CODIGO 
group by j.NOMBRE order by puntos desc FETCH FIRST 1 ROW ONLY;

-- 12.	Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT e.NOMBRE AS equipo, e.CONFERENCIA, e.DIVISION  FROM equipos e JOIN jugadores j ON e.NOMBRE = j.NOMBRE_EQUIPO
WHERE j.ALTURA = (SELECT MAX(j.ALTURA) FROM jugadores j);

-- 13.	Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos. (CREAR UNA VIEW)
CREATE OR REPLACE VIEW PARTIDO_DIFERENCIA AS
SELECT 
    EQUIPO_LOCAL,  EQUIPO_VISITANTE, 
    ABS(PUNTOS_LOCAL - PUNTOS_VISITANTE) AS DIFERENCIA FROM partidos
      WHERE ABS(PUNTOS_LOCAL - PUNTOS_VISITANTE) = (
        SELECT  MAX(ABS(PUNTOS_LOCAL - PUNTOS_VISITANTE)) FROM  partidos);
SELECT * FROM PARTIDO_DIFERENCIA;
-- 14.	Mostrar la media de puntos en partidos de los equipos de la división Pacific. (CREAR UNA VIEW)
CREATE OR REPLACE VIEW PUNTOS_PACIF AS
SELECT E.NOMBRE AS NOMBRE_EQUIPO,
    AVG(CASE 
            WHEN P.EQUIPO_LOCAL = E.NOMBRE THEN P.PUNTOS_LOCAL 
            ELSE P.PUNTOS_VISITANTE 
        END) AS MEDIA_PUNTOS
FROM equipos E JOIN  partidos P ON E.NOMBRE = P.EQUIPO_LOCAL OR E.NOMBRE = P.EQUIPO_VISITANTE
WHERE E.DIVISION = 'Pacific' GROUP BY  E.NOMBRE;
SELECT * FROM PUNTOS_PACIF;

-- 15.	Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante. Usa una vista (CREAR UNA VIEW)
CREATE or replace VIEW EQUIPOS_OUNTOS AS
SELECT 
    EQUIPO_LOCAL AS NOMBRE_EQUIPO,
    SUM(PUNTOS_LOCAL) AS PUNTOS_ANOTADOS
FROM  partidos GROUP BY EQUIPO_LOCAL UNION ALL 
SELECT 
    EQUIPO_VISITANTE AS NOMBRE_EQUIPO,
    SUM(PUNTOS_VISITANTE) AS PUNTOS_ANOTADOS
FROM partidos GROUP BY EQUIPO_VISITANTE;
SELECT * FROM EQUIPOS_OUNTOS;