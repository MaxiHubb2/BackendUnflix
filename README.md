# UnFlixApp

![Version](https://img.shields.io/badge/version-1.0.0-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-green)
![Java](https://img.shields.io/badge/Java-11-orange)
![API](https://img.shields.io/badge/API-Restful-red)
![Netlify](https://img.shields.io/badge/Deployed%20on-Netlify-brightgreen)

## Descripción

UnFlixApp es una aplicación web para la gestión y visualización de una base de datos de películas. La aplicación está desarrollada en Java utilizando Spring Boot para el backend y se conecta a una API que maneja una base de datos propia de películas. El frontend está desplegado en Netlify.

## Demo en Vivo

Puedes acceder a la demo en vivo de la aplicación a través del siguiente enlace:

[UnFlixApp en Netlify](https://unflixapp.netlify.app/)

## Funcionalidades

- Visualización de películas disponibles.
- Búsqueda de películas por título.
- Visualización de detalles de cada película.
- Conexión a una API RESTful para obtener datos de películas.

## Tecnologías Utilizadas

- **Backend:**
  - ![Java](https://img.shields.io/badge/Java-11-orange)
  - ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-green)
  - JPA/Hibernate
  - MySQL (o la base de datos que utilices)
  
- **Frontend:**
  - HTML5
  - CSS3
  - JavaScript
  - Bootstrap

- **Despliegue:**
  - ![Netlify](https://img.shields.io/badge/Netlify-brightgreen)

## Instalación y Configuración

### Requisitos Previos

- Java 11 o superior
- Maven
- MySQL (o la base de datos que utilices)

### Pasos para la Instalación

1. **Clona el repositorio:**
    ```bash
    git clone https://github.com/tu_usuario/unflixapp.git
    ```

2. **Configura la base de datos:**

    Crea una base de datos en MySQL y actualiza el archivo `application.properties` con tus credenciales de base de datos:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/unflixapp
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Compila y ejecuta la aplicación:**
    ```bash
    cd unflixapp
    mvn clean install
    mvn spring-boot:run
    ```

4. **Accede a la aplicación:**

    Abre tu navegador web y navega a `http://localhost:8080`.

## API Endpoints

- **GET /api/peliculas:** Obtener todas las películas.
- **GET /api/peliculas/{id}:** Obtener una película por ID.
- **POST /api/peliculas:** Crear una nueva película.
- **PUT /api/peliculas/{id}:** Actualizar una película existente.
- **DELETE /api/peliculas/{id}:** Eliminar una película.

## Capturas de Pantalla

### Página Principal
![Página Principal](https://via.placeholder.com/800x400)

### Detalles de Película
![Detalles de Película](https://via.placeholder.com/800x400)

## Contribuciones

¡Las contribuciones son bienvenidas! Por favor, abre un issue o envía un pull request para mejoras y correcciones.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

## Contacto

Si tienes preguntas o sugerencias, no dudes en contactar a:

- **Nombre:** Tu Nombre
- **Email:** tu.email@example.com

---

¡Gracias por visitar UnFlixApp!
