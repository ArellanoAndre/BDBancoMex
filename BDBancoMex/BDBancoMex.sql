 #BASE DE DATOS
CREATE DATABASE IF NOT EXISTS EcoActivistas;

    -- 1 Creación de la tabla 
CREATE TABLE IF NOT EXISTS Cliente ( 
    ID INT PRIMARY KEY AUTO_INCREMENT, 
    Nombre VARCHAR(30),
	Direccion VARCHAR(50));
	-- 1.2 Creación de la tabla 
   CREATE TABLE Telefono (
    CodigoTelefono INT PRIMARY KEY AUTO_INCREMENT,
    numero VARCHAR(20),
    ID INT,
    FOREIGN KEY (ID) REFERENCES Cliente(ID));