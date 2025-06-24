# 🌐 Spring Boot MVC Web App - "Hola, Mundo" con Thymeleaf

Este proyecto es una aplicación web simple desarrollada con **Spring Boot**, **Spring MVC** y **Thymeleaf**, que muestra un saludo personalizado en una página HTML.

---

## 📌 ¿Qué hace esta aplicación?

- Responde a solicitudes HTTP GET en: `http://localhost:8080/mvc`.
- Muestra una página HTML dinámica usando Thymeleaf.
- Permite pasar un nombre por parámetro:  
  👉 `http://localhost:8080/mvc?name=Usuario`.

---

---

## 📋 Requisitos

- Java 17 o superior
- Maven 3.5+
- IDE: IntelliJ, VSCode, Eclipse, etc.
- [Thymeleaf](https://www.thymeleaf.org/) (ya incluido vía Spring Boot Starter Web)

---

## 🚀 Cómo ejecutar

### 1. Clona el proyecto o crea uno con Spring Initializr

Puedes crear este mismo proyecto desde [start.spring.io](https://start.spring.io) con las siguientes dependencias:

- `Spring Web`
- `Thymeleaf`
- `Spring Boot DevTools` (opcional pero recomendado)

O clona el repositorio:

```bash
git clone https://github.com/tu-usuario/spring-boot-mvc-thymeleaf.git
cd spring-boot-mvc-thymeleaf
```


## como correr

```bash
./mvnw spring-boot:run
```
y se hace una peticion a 

http://localhost:8080/mvc

con parametro de name con el nombre, si no se pone nada toma or default word
