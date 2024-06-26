<h1 align="center">Alura Latam. Challenge Foro Hub </h1>
<p align="left">
   <img src="https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green">
</p>

<p align="left">
">
  
</p>


### Tópicos

- [Descripción del proyecto](#descripción-del-proyecto)

- [Funcionalidades](#funcionalidades)

- [Tecnologías utilizadas](#tecnologías-utilizadas)

- [Librerias utilizadas](#api-utilizada)

- [Como abrir](#como-abrir)

- [Personas Contribuyentes](#personas-contribuyentes)

- [Licencia](#licencia)


## Descripción del proyecto
<p align="justify">
Este reto busca poner en práctica la creación de una API en Spring Boot para crear un aplicación de un Foro. Utiliza diversas librerías que facilitan el proceso de desarrollo, así como se pone en práctica el uso de diferentes herramientas como Insomnia, Trello, MySql, WorkBench Sql, ItelliJ IDE CE.
La API busca ofrecer servicios básicos CRUDE, para el manejo de Tópicos en un Foro.
La API, provee los servicios de lectura de todos o uno de los tópicos almacenados en la base de datos, la actualización de un tópico, la creación de tópicos, y la eliminación de un tópico en especial.
Para cada una de las solicitudes de la API se requiere un susuario previamente de autenticado y autorizado, el cual debe estar previamente registrado en la base de datos.
En dirección del cliente, la API envía como mejor práctica los datos contenidos de cada operación por medio del uso de DTO y se envia al cliente un token JWT como parte de la comunicación entre el servidor y el usuario.

![Descripción del proyecto. La figura muestra un niño leyendo un libor](xx)

</p>

## Funcionalidades

<p align="justify">
Registro, lectura, actualiazción y eliminación de un tópico.
</p>

:heavy_check_mark: `Funcionalidad 1:` Creación de tópico.

:heavy_check_mark: `Funcionalidad 2:` Lectura de uno o todos los tópicos.

:heavy_check_mark: `Funcionalidad 3:` Borrado de un tópico.

:heavy_check_mark: `Funcionalidad 4:` Actualización de un tópico.

heavy_check_mark: `Funcionalidad 5:` Acceso a la API, solo para usuarios registrados en base de datos com autenticación y autorización.


## Tecnologías utilizadas
<p align="justify">
Java v 17
</p>

<p align="justify">
Spring Boot
</p>

<p align="justify">
MySql
</p>

<p align="justify">
Affinity Designer.
</p>

## Librerias utilizadas
<p align="justify">
Validación
</p>
<p align="justify">
Spring Boot Starter
</p>
<p align="justify">
Spring Boot devTools
</p>
<p align="justify">
Flywaydb
</p>
<p align="justify">
Spring Boot starter data jpa
</p>
<p align="justify">
Spring Boot Lombok
</p>
<p align="justify">
Spring Boot Security
</p>



## Como abrir
<p align="justify">
Haciendo uso de ITelliJ IDEA, agregando la contraseña de la base de datos MYSQL en el campo spring.datasource.password=, asi como el campo api.security.secret=${JWT_SECRET:123456}} (HMAC256), el cual puede ser alamacenado como variable glogal o puede usar el valor por defecto ya mostrado.
Recomendado utilizar herramienta Imsonia para hacer la pruebas básicas de envío y recepción de respuesta de la API.
localhost:8080/login para lograr tener el token JWT, el cual deber ser utilizado en el encabezado de la solicitud al servdior junto con usuario y la ocntraseña, la cual debe figurar previamente en la bsae de datos de forma ecriptada
URL Login: localhost:8080/login
Alamcenar un Tópico (POST): localhost:8080/topico
Leer todos los Tópicos (GET): localhost:8080/topico
Leer un solo Tópico (GET): localhost:8080/topico/id  Donde id es un número Long
Actualizar un solo Tópico (PUT): localhost:8080/topico/id  Donde id es un número Long
Borrar un solo Tópico (DELETE): localhost:8080/topico/id  Donde id es un número Long
</p>


## Personas Contribuyentes
<p align="justify">
Jaime Eraso
</p>

## Licencia

<p align="justify">
Derechos reservados
</p>
