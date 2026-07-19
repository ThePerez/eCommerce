# 🛒 TechLab Store - E-Commerce API

¡Hola! 👋 Este repositorio contiene el proyecto integrador final del curso **Back-End Java** de **Talento Tech**. 

## 🚀 Sobre el desarrollo y el curso

Arrancamos desde las bases de Java y POO, hasta llegar a levantar nuestra propia API REST. Fue un camino clave para entender cómo estructurar el backend de una aplicación, manejar dependencias, configurar bases de datos y finalmente conectar todo para que responda a una vista web. 

## 🛠️ Stack Tecnológico

*   **Java** ☕
*   **Spring Boot** 🍃 (Controladores REST, Servicios, JPA/Hibernate)
*   **Base de Datos:** H2 (en memoria, ideal para pruebas rápidas) 🗄️
*   **Frontend:** HTML5, Bootstrap 5 y Vanilla JS (Fetch) 🌐

## ✨ ¿Qué hace este proyecto?

*   **CRUD completo:** Permite crear, listar, actualizar stock y eliminar tanto Productos como Categorías.
*   **Relaciones en BD:** Mapeo relacional automático con Hibernate.
*   **Interfaz visual:** Una web responsiva e integrada que consume la API en tiempo real para mostrar el catálogo actualizado.

## 🚀 Instrucciones para probarlo

1. **Ejecutar el backend:**
   - Asegurate de tener el proyecto abierto en VS Code.
   - Corré la aplicación desde `EcommerceApplication.java` (botón Play) o desde la terminal con:
     `.\mvnw.cmd spring-boot:run`

2. **Cargar datos (usando Thunder Client o Postman):**
   Como la base de datos es en memoria (H2), empezá cargando una categoría:
   - **POST** a `http://localhost:9090/api/categorias`
     ```json
     { "nombre": "Tecnología" }
     ```
   - Luego, cargá un producto usando el ID de la categoría (ejemplo, ID 1):
     - **POST** a `http://localhost:9090/api/productos/categoria/1`
       ```json
       { 
         "nombre": "Notebook Pro", 
         "descripcion": "Laptop de última generación", 
         "precio": 850000.0, 
         "stock": 5 
       }
       ```

3. **Ver el resultado:**
   - Abrí tu navegador en `http://localhost:9090` y verás el catálogo actualizado automáticamente. 🌐
---
*Desarrollado por Alexander Pérez*
