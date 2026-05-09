# Tarea - Sistema de Restaurante

## Requisitos
- Java 21
- Spring Boot
- PostgreSQL

## Dependencias utilizadas
- Spring Devtools
- Spring Web
- Lombock
- PostgreSQL
- Spring JPA

## Configuración de la base de datos

Crear la base de datos en pgAdmin con el siguiente script SQL:

```sql
CREATE DATABASE "Restaurante00095322";
```

## Variables de entorno

Configurar en IntelliJ `Environment Variables`:

```
DB_URL=jdbc:postgresql://localhost:5432/Restaurante00095322
DB_USER=postgres
DB_PASSWORD=WMJM261202261202jm-- (PERDON POR TREMENDA CONTRASEÑA JAJAJSDKJD)
```

## Ejecutar el proyecto

La tabla `platos` se crea automáticamente al iniciar la aplicación gracias a Hibernate con `ddl-auto: update`.