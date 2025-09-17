---

```markdown
# 📦 Dashboard de Gestión de Inventario

Este proyecto corresponde a la evidencia **GA8-220501096-AA1-EV01** del programa **Tecnólogo en Análisis y Desarrollo de Software (SENA)**.  
El objetivo es demostrar la integración de módulos de software mediante un sistema sencillo de gestión de inventario en **Java**, usando **IntelliJ IDEA** como IDE.

---

## 🚀 Funcionalidades principales

El sistema está compuesto por módulos que representan las áreas fundamentales de un inventario:

1. **Módulo Usuario**
   - Permite crear usuarios con nombre y rol.
   - Roles básicos: *Administrador*, *Empleado*, etc.

2. **Módulo Producto**
   - Registro de productos con código, nombre y stock.
   - Operaciones de entrada y salida de inventario.
   - Validación de stock insuficiente.

3. **Módulo Reporte**
   - Genera un reporte básico con la información del producto.
   - Permite visualizar el stock actual.

4. **Clase Main (Integración)**
   - Integra los módulos.
   - Simula operaciones de entrada y salida de productos.
   - Genera reportes por consola.

---

## 📂 Estructura del proyecto

```

src/
├── Main.java          # Clase principal, integra todos los módulos
├── Usuario.java       # Módulo de gestión de usuarios
├── Producto.java      # Módulo de gestión de productos
└── Reporte.java       # Módulo de reportes

````

---

## 🛠️ Tecnologías usadas

- **Java 21** (OpenJDK 21.0.8)
- **IntelliJ IDEA Community Edition**
- **JUnit** (para pruebas unitarias)
- **Git/GitHub** (para control de versiones)

---

## 📖 Ejemplo de ejecución

```bash
Usuario admin = new Usuario("Adriana", "Administrador");
Producto laptop = new Producto("P001", "Laptop", 10);

laptop.entrada(5);     // stock = 15
laptop.salida(3);      // stock = 12

Reporte reporte = new Reporte();
reporte.generarReporte(laptop);
````

**Salida esperada por consola:**

```
Reporte de producto:
Código: P001
Stock actual: 12
```

---

## ✅ Evidencias de buenas prácticas

* Código modular y orientado a objetos.
* Buenas prácticas de nombres y encapsulamiento.
* Uso de IDE (IntelliJ) y control de versiones (Git).
* Pruebas unitarias implementadas en JUnit.

---

## 👩‍💻 Autor

* **Robinson Mosquera Cubides**

