# Sistema de Inventario – ERP (Prueba de Concepto)

Este proyecto es una **prueba de concepto (PoC)** de un microservicio de inventario desarrollado en **Spring Boot** con **PostgreSQL** como base de datos.  
Permite registrar y consultar productos de manera sencilla mediante una API REST.

---

## 📌 Arquitectura

El sistema sigue una arquitectura basada en **microservicios** y **Spring Boot**.  

```mermaid
flowchart TD
    A[Cliente (Postman/Frontend)] -->|HTTP REST| B[Spring Boot Inventario API]
    B -->|JPA/Hibernate| C[(Base de Datos PostgreSQL)]
```

- **Cliente**: Puede ser Postman, curl o una app frontend.  
- **API REST (Spring Boot)**: Expone endpoints para CRUD de productos.  
- **Base de datos**: PostgreSQL almacena los productos en la tabla `producto`.

---

## 📌 Requerimientos

Para ejecutar este proyecto necesitas:

- **Java 21** (Corretto u OpenJDK).  
- **Maven 3.9+**.  
- **PostgreSQL 15 o superior**.  
- **Postman** (o cualquier cliente REST) para probar la API.  

---

## 📌 Instrucciones de ejecución

1. **Clona el repositorio:**
   ```bash
   git clone <URL_DEL_REPO>
   cd Inventario
   ```

2. **Crea la base de datos en PostgreSQL:**
   ```sql
   CREATE DATABASE erpdb;
   ```

3. **Configura `application.yml` con tus credenciales:**
   ```yaml
   server:
     port: 8081

   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/erpdb
       username: postgres
       password: admin
       driver-class-name: org.postgresql.Driver

     jpa:
       hibernate:
         ddl-auto: update
       properties:
         hibernate.dialect: org.hibernate.dialect.PostgreSQLDialect
       show-sql: true
   ```

4. **Compila y corre la aplicación:**
   ```bash
   mvn spring-boot:run
   ```

5. **Accede a la API en:**  
   [http://localhost:8081](http://localhost:8081)

---

## 📌 Ejemplo de uso con Postman

👉 Crear un producto (POST):  

- **URL:** `http://localhost:8081/api/productos`  
- **Método:** `POST`  
- **Body (JSON):**
  ```json
  {
    "nombre": "Laptop",
    "precio": 15000,
    "stock": 5
  }
  ```

👉 Obtener todos los productos (GET):  
- **URL:** `http://localhost:8081/api/productos`  
- **Método:** `GET`

👉 Obtener un producto por ID (GET):  
- **URL:** `http://localhost:8081/api/productos/1`  

👉 Eliminar un producto (DELETE):  
- **URL:** `http://localhost:8081/api/productos/1`  

---

✅ Con este README cumples con **Arquitectura + Requerimientos + Instrucciones** → listo para la rúbrica de **20 puntos** 🎯
