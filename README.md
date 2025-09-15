# Sistema de Inventario – ERP (Prueba de Concepto)

Este proyecto es una **prueba de concepto (PoC)** de un microservicio de inventario desarrollado en **Spring Boot** con **PostgreSQL** como base de datos.  
Permite registrar y consultar productos de manera sencilla mediante una API REST.

## Arquitectura

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

La aplicación quedará corriendo en:  
[http://localhost:8081](http://localhost:8081)