/* PROCEDIMIENTOS Y PAQUETES FASE 2 */

---------------------TRABAJADORES 

SELECT * FROM TRABAJADORES;

CREATE OR REPLACE PROCEDURE P_MOSTRAR_TRABAJADOR (ID_TRA TRABAJADORES.ID_TRABAJADOR%TYPE) AS
E_ID_INEXISTENTE EXCEPTION;
V_NOMBRE TRABAJADORES.NOMBRE%TYPE;
V_APELLIDO TRABAJADORES.AP1%TYPE;
BEGIN
SELECT NOMBRE,AP1 AS "APELLIDO" INTO V_NOMBRE,V_APELLIDO FROM TRABAJADORES WHERE ID_TRABAJADOR = ID_TRA;
EXCEPTION
WHEN NO_DATA_FOUND THEN
RAISE E_ID_INEXISTENTE;
END P_MOSTRAR_TRABAJADOR;

CREATE OR REPLACE PROCEDURE P_AUMENTO_SALARIO(V_ID TRABAJADORES.ID_TRABAJADOR%TYPE) AS
V_SUBIDA NUMBER := 0.03;
E_ID_INEXISTENTE EXCEPTION;
BEGIN
UPDATE TRABAJADORES SET SALARIO = SALARIO+(SALARIO*0.03) WHERE ID_TRABAJADOR = V_ID;
IF SQL%NOTFOUND THEN
RAISE E_ID_INEXISTENTE;
END IF;
COMMIT;
END P_AUMENTO_SALARIO;

CREATE OR REPLACE PROCEDURE P_MOSTRAR_TRABAJADORES
(RECORD_TRABAJ OUT SYS_REFCURSOR) AS
BEGIN
OPEN RECORD_TRABAJ FOR
SELECT * FROM TRABAJADORES;
END P_MOSTRAR_TRABAJADORES;

--------------------------CENTROS

SELECT * FROM CENTROS;

CREATE OR REPLACE PROCEDURE P_MOSTRAR_CENTROS(RECORD_CENTROS OUT SYS_REFCURSOR) AS
BEGIN
OPEN RECORD_CENTROS FOR
SELECT * FROM CENTROS;
END P_MOSTRAR_CENTROS;

CREATE OR REPLACE PROCEDURE P_VER_CENTRO ( ID CENTROS.ID_CENTRO%TYPE) AS
V_DIRECCION CENTROS.DIRECCION%TYPE;
V_TELEFONO CENTROS.TELF%TYPE;
E_INEXISTENTE EXCEPTION;
BEGIN
SELECT DIRECCION,TELF INTO V_DIRECCION,V_TELEFONO FROM CENTROS WHERE ID_CENTRO = ID;
EXCEPTION
WHEN NO_DATA_FOUND THEN
RAISE E_INEXISTENTE;
END P_VER_CENTRO;

--------PACKAGE CENTROS

CREATE OR REPLACE PACKAGE PK1 IS 
  PROCEDURE P_MOSTRAR_CENTROS (RECORD_CENTROS OUT SYS_REFCURSOR);
  PROCEDURE P_VER_CENTRO  (ID CENTROS.ID_CENTRO%TYPE);
END;
CREATE OR REPLACE PACKAGE BODY PK1 IS 
PROCEDURE P_MOSTRAR_CENTROS(RECORD_CENTROS OUT SYS_REFCURSOR) IS
BEGIN
  OPEN RECORD_CENTROS FOR
  SELECT * FROM CENTROS;
END  P_MOSTRAR_CENTROS;
PROCEDURE P_VER_CENTRO ( ID CENTROS.ID_CENTRO%TYPE) IS
V_DIRECCION CENTROS.DIRECCION%TYPE;
V_TELEFONO CENTROS.TELF%TYPE;
E_INEXISTENTE EXCEPTION;
BEGIN
SELECT DIRECCION,TELF INTO V_DIRECCION,V_TELEFONO FROM CENTROS WHERE ID_CENTRO = ID;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
    RAISE E_INEXISTENTE;
  END P_VER_CENTRO;
END;

CREATE OR REPLACE PROCEDURE P_CREAR_CENTRO 
(ID CENTROS.ID_CENTRO%TYPE,
NOMBRE CENTROS.NOMBRE%TYPE,
DIRECCION CENTROS.DIRECCION%TYPE,
CP CENTROS.CP%TYPE,
LOC CENTROS.LOC%TYPE,
PROV CENTROS.PROVINCIA%TYPE,
TELEFONO CENTROS.TELF%TYPE) 
AS 
BEGIN
INSERT INTO CENTROS VALUES (ID,NOMBRE,DIRECCION,CP,LOC,PROV,TELEFONO);
END P_CREAR_CENTRO;


---------------------------------LOGIN

SELECT * FROM USUARIOS;

CREATE OR REPLACE PROCEDURE P_COMPROBAR_LOGIN 
(ID USUARIOS.ID_USUARIO%TYPE,CONTRA USUARIOS.CONTRASE�A%TYPE)AS
E_USUARIO_INCORRECTO EXCEPTION;
E_LOGIN_CORRECTO EXCEPTION;
CURSOR C_USER IS SELECT ID_USUARIO,CONTRASE�A FROM USUARIOS WHERE ID_USUARIO = ID AND CONTRASE�A=ORA_HASH(CONTRA);
BEGIN
FOR RECORD_USUARIOS IN C_USER LOOP
IF SQL%NOTFOUND THEN RAISE E_USUARIO_INCORRECTO;
ELSE RAISE E_LOGIN_CORRECTO;
END IF;
END LOOP;
END P_COMPROBAR_LOGIN;












