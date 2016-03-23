COMMENT ON TABLE Usuario IS
'Tabla para almacenar la informacion de los usuarios
Contiene un correo electronico como identificador,
un nombre de usuario, y una contrasena';

CREATE TABLE usuario (
	correo			VARCHAR(200) PRIMARY KEY,
	nombreUsuario	VARCHAR(100),
	contrasena		VARCHAR(100)
);

COMMENT ON TABLE Comentario IS
'Tabla para almacenar comentarios hechos por los usuarios';

CREATE TABLE comentario (
	correo 			VARCHAR(200) PRIMARY KEY REFERENCES Usuario(correo),
	contenido 		VARCHAR(200)
);