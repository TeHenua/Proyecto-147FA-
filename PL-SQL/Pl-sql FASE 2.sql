--PROCEDIMIENTO LISTAR TODOS LOS TRABAJADORES 
 
CREATE OR REPLACE PROCEDURE CONSULTA_TRABAJADORES(C_TRA OUT SYS_REFCURSOR) 
AS 
  SIN_DATOS EXCEPTION; 
  OTRO_ERROR EXCEPTION; 
BEGIN 
  OPEN C_TRA FOR 
  SELECT ID_TRABAJADOR,NOMBRE,AP1,AP2 FROM TRABAJADOR; 
EXCEPTION 
  WHEN NO_DATA_FOUND THEN 
    RAISE SIN_DATOS; 
  WHEN OTHERS THEN 
    RAISE OTRO_ERROR;     
END CONSULTA_TRABAJADORES; 
 
--PROCEDIMIENTO LISTAR UN TRABAJADOR 
 
CREATE OR REPLACE PROCEDURE CONSULTA_TRABAJADOR(ID_TRA IN TRABAJADOR.ID_TRABAJADOR%TYPE, 
  TRA OUT TRABAJADOR%ROWTYPE ) 
AS 
  SIN_DATOS EXCEPTION; 
  OTRO_ERROR EXCEPTION; 
  MAS_LINEAS EXCEPTION; 
BEGIN 
  SELECT * INTO TRA FROM TRABAJADOR WHERE ID_TRABAJADOR=ID_TRA; 
EXCEPTION 
  WHEN NO_DATA_FOUND THEN 
    RAISE SIN_DATOS; 
  WHEN OTHERS THEN 
    RAISE OTRO_ERROR;     
  WHEN TOO_MANY_ROWS THEN 
    RAISE MAS_LINEAS; 
END CONSULTA_TRABAJADOR; 
 
--PAQUETE LISTAR CENTROS 
 
CREATE OR REPLACE PACKAGE PAQ_CENTROS 
AS 
  SIN_DATOS EXCEPTION; 
  OTRO_ERROR EXCEPTION; 
  MAS_LINEAS EXCEPTION; 
PROCEDURE CONSULTA_CENTRO(ID_CEN IN CENTRO.ID_CENTRO%TYPE, 
  CEN OUT CENTRO%ROWTYPE); 
PROCEDURE CONSULTA_CENTROS(C_CEN OUT SYS_REFCURSOR); 
END PAQ_CENTROS; 
 
CREATE OR REPLACE PACKAGE BODY PAQ_CENTROS  
AS 
  PROCEDURE CONSULTA_CENTRO(ID_CEN IN CENTRO.ID_CENTRO%TYPE, 
  CEN OUT CENTRO%ROWTYPE) 
  AS 
  BEGIN 
    SELECT * INTO CEN FROM CENTRO WHERE ID_CENTRO=ID_CEN; 
  EXCEPTION 
    WHEN NO_DATA_FOUND THEN 
      RAISE SIN_DATOS; 
    WHEN OTHERS THEN 
      RAISE OTRO_ERROR;    
    WHEN TOO_MANY_ROWS THEN 
      RAISE MAS_LINEAS; 
  END CONSULTA_CENTRO; 
  PROCEDURE CONSULTA_CENTROS(C_CEN OUT SYS_REFCURSOR) 
  AS 
  BEGIN 
    OPEN C_CEN FOR 
    SELECT ID_CENTRO,NOMBRE,LOC FROM CENTRO; 
  EXCEPTION 
    WHEN NO_DATA_FOUND THEN 
      RAISE SIN_DATOS; 
    WHEN OTHERS THEN 
      RAISE OTRO_ERROR;    
  END CONSULTA_CENTROS; 
END PAQ_CENTROS; 