# 📋 Task API - Spring Boot REST API

Una aplicación RESTful para la gestión de tareas, desarrollada con Java y Spring Boot. Soporta operaciones CRUD completas, validación de datos, DTOs y persistencia en base de datos usando JPA.

---

## 🚀 Cómo ejecutar el proyecto

1. **Clona el repositorio:**

``git clone https://github.com/tuusuario/task-api.git
2. Asegúrate de tener instalado:
   Java 17 o superior
   Maven
   PostgreSQL o MySQL (o puedes usar H2 para pruebas)

3. 🛠️ Tecnologías usadas
    Java 17
   Spring Boot
   Spring Data JPA
   Spring Validation
   Lombok
   DTOs (Data Transfer Objects)
   REST API
   Maven
   Postman
4. 📂 Estructura del proyecto
   Editar
      └── src
          └── main
              ├── java
              │   └── com.ecajas.taskapi
              │       ├── controller        # Controladores REST
              │       ├── dto              # Clases DTO (Request / Response)
              │       ├── model            # Entidad JPA: Task
              │       ├── repository       # Interfaz JpaRepository
              │       └── service
              │           ├── impl         # Implementación del servicio
              │           └── TaskService  # Interfaz de servicio
              └── resources
                  ├── application.properties

5.  Notas adicionales
   El campo createdAt se genera automáticamente usando ZonedDateTime.now() al crear la entidad.
   La validación se realiza mediante anotaciones como @NotBlank y @Pattern.
   Se implementan DTOs para desacoplar la capa de presentación del modelo de dominio.
   La API sigue buenas prácticas y está lista para ser extendida con autenticación o paginación.
   El proyecto utiliza Spring Data JPA para gestionar la persistencia de datos. La entidad Task está mapeada a una tabla en la base de datos, y se utilizan anotaciones como     @Entity, @Id, @GeneratedValue, @Column, y @PrePersist para definir su comportamiento.

   
  












   
