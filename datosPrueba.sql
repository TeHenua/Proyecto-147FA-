INSERT INTO CENTRO(NOMBRE,DIRECCION,CP,LOC,PROVINCIA,TELF) VALUES('NOMRE','Direccion','CP','LOC','PROV','TEL');
INSERT INTO TRABAJADOR(DNI,NOMBRE,AP1,AP2,DIRECCION,TELF_EMPRESA,TELF_PERSONAL,CATEGORIA,SALARIO,FECHANAC,ID_CENTRO) 
VALUES('12312312A','Nombre','Apellido','Apellido','Direccion','654644654','945945945','Administrativo',1200,sysdate,1);
INSERT INTO CENTRO(NOMBRE,DIRECCION,CP,LOC,PROVINCIA,TELF) VALUES('Nombre','Direccion','12345','Localidad','Provincia','987987987');
INSERT INTO USUARIO VALUES('TeHenua',ora_hash('aaaaa'));
UPDATE TRABAJADOR SET ID_USUARIO='TeHenua' WHERE ID_TRABAJADOR=2;
COMMIT;
update usuario set "CONTRASE�A"=ora_hash('aaaaa') where id_usuario='TeHenua';
select * from usuario;
select * from trabajador;
select * from centro;
DROP TABLE TRABAJADOR CASCADE CONSTRAINTS

DESC TRABAJADOR