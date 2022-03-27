# Music Application
Spring Cloud | Training Configuration for Microservices Architecture

# Ejercicio 
A partir de la siguiente arquitectura de microservicios construiremos las aplicaciones
necesarias con Spring Cloud.

![image](https://user-images.githubusercontent.com/81278103/160295283-77ce876e-87ad-4ba4-8a46-c2123b8b29f7.png)


Tendremos microservicios de música y playlist. Deberemos configurar el servidor Eureka
para reconocer microservicios usando los nombres:
- música-service
- playlist-service
A su vez, deberemos crear el proyecto gateway y configurar el enrutamiento para ambos
microservicios. Luego, agregar y configurar la configuración del servidor para obtener la
configuración de un repositorio de Git.

# Ajustes
Configurar el puerto de cada microservicio desde un repositorio Git.
Propiedad:
server.port=

# música-service
Es una API REST que nos permite traer música por género. El endpoint debe ser:
/música/{genre}
Cada canción tiene como atributo:
- id
- nome
- genre
- artista
- urlStream

# playlist-service

API REST que nos permite buscar la lista de reproducción por género. De momento solo
buscaremos canciones. El endpoint debe ser: /playlist/{genre}

- Usar Feign para comunicarse con el microservicio del servicio de música y
obtener las canciones.

La respuesta tiene la siguiente estructura:
- género
  - música
    - id 
    - name
    - genre
    - artista
    - urlStream
