# 📋 Task API - Spring Boot REST API

Una aplicación RESTful para la gestión de tareas, desarrollada con Java y Spring Boot. Soporta operaciones CRUD completas, validación de datos, DTOs y persistencia en base de datos usando JPA.

---

## 🚀 Cómo ejecutar el proyecto

1. **Clona el repositorio:**
```
git clone https://github.com/tuusuario/task-api.git
```

2. Asegúrate de tener instalado:
   - Java 17 o superior
   - Maven
   - MySQL

3. 🛠️ Tecnologías usadas
   - Java 17
   - Spring Boot
   - Spring Data JPA
   - Spring Validation
   - Lombok
   - DTOs (Data Transfer Objects)
   - REST API
   - Maven
   - Postman
4. 📂 Estructura del proyecto
   ````
   Editar
      └── src
          └── main
              ├── java
              │   └── com.ecajas.taskapi
              │       ├── controller       
              │       ├── dto              
              │       ├── model            
              │       ├── repository      
              │       └── service
              │           ├── impl        
              │           └── TaskService  
              └── resources
                  ├── application.properties

5. Endpoints

   | Método | Ruta          | Descripción                       |
   |--------|---------------|-----------------------------------|
   | POST   | `/tasks`      | Crear una nueva tarea             |
   | GET    | `/tasks`      | Listar todas las tareas           |
   | GET    | `/tasks/{id}` | Obtener una tarea por su ID       |
   | PUT    | `/tasks/{id}` | Actualizar una tarea existente    |
   | DELETE | `/tasks/{id}` | Eliminar una tarea                |

7. Notas adicionales
   - El campo createdAt se genera automáticamente usando ZonedDateTime.now() al crear la entidad.
   - La validación se realiza mediante anotaciones como @NotBlank y @Pattern.
   - Se implementan DTOs para desacoplar la capa de presentación del modelo de dominio.
   - La API sigue buenas prácticas y está lista para ser extendida con autenticación o paginación.
   - El proyecto utiliza Spring Data JPA para gestionar la persistencia de datos. La entidad Task está mapeada a una tabla en la base de datos, y se utilizan anotaciones          como  @Entity, @Id, @GeneratedValue, @Column, y @PrePersist para definir su comportamiento.

   
  












   
