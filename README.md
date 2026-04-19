 📱 MovilFourTechnology

**Tienda online de equipos de telefonía – Evidencia SENA**  
Proyecto desarrollado con arquitectura **MVC** y base de datos MySQL.  
Incluye código fuente, documentación y archivo `.sql` para importar la base de datos.

---

## 📂 Estructura del proyecto

- **CONTROLADOR/**  
  Contiene los controladores Java que gestionan las peticiones del usuario.  
  Ejemplos:  
  - `ordencontrolador.java`  
  - `productocontrolador.java`  
  - `usuariocontrolador.java`

- **SERVICIO/**  
  Contiene la lógica de negocio y reglas de aplicación.  
  Ejemplos:  
  - `ordenservicio.java`  
  - `productservicio.java`  
  - `usuarioservicio.java`

- **MODELO/**  
  Contiene las entidades y clases de persistencia que representan la base de datos.  
  Ejemplos:  
  - `ordenmodelo.java`  
  - `productomodelo.java`  
  - `usuariomodelo.java`

- **movilfourdb.sql**  
  Archivo exportado desde MySQL Workbench con la estructura y datos de la base de datos.

- **README.md**  
  Documentación del proyecto.

---

## 🗄️ Base de datos

El archivo `movilfourdb.sql` contiene las tablas principales:

- `clientes`  
- `productos`  
- `usuarios`  
- `ventas`

### Importar en MySQL Workbench

1. Abrir **MySQL Workbench**.  
2. Ir a **Servidor → Restaurar datos (Data Import)**.  
3. Seleccionar **Importar desde archivo independiente (Self-Contained File)**.  
4. Elegir el archivo `movilfourdb.sql`.  
5. Seleccionar el esquema destino (ejemplo: `movilfourdb`).  
6. Presionar **Iniciar importación (Start Import)**.  
7. Verificar que las tablas estén creadas correctamente.

---

## ⚙️ Configuración del proyecto

- **Lenguaje:** Java  
- **Framework:** Spring Boot  
- **IDE recomendado:** IntelliJ IDEA / Eclipse  
- **Servidor:** Tomcat embebido en Spring Boot  
- **Base de datos:** MySQL  
- **Gestión de dependencias:** Maven  

### Configuración de conexión (application.properties)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/movilfourdb
spring.datasource.username=root
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
