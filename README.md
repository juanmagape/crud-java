# 🗂️ Gestor de Tareas en Java (con CSV)

Un pequeño proyecto en **Java** que permite gestionar una lista de tareas desde la consola.  
Cada tarea tiene un **nombre** y un **estado**, y se almacenan en un archivo **CSV** para mantener la persistencia entre ejecuciones.

---


## 💡 TODO

- Borrar tareas individualmente.  
- Optimización de código

---

## 🚀 Funcionalidades

El programa cuenta con un menú interactivo que permite:

1. **Añadir tareas**  
   - Se introduce el nombre de la tarea y su estado.  
   - La información se guarda en el archivo CSV.

2. **Mostrar tareas**  
   - Lista todas las tareas guardadas en el CSV con su número, nombre y estado.  
   - Los índices se reinician cada vez que se muestra la lista.

3. **Editar tareas**  
   - Permite cambiar el **nombre** o el **estado** de una tarea existente.  
   - El usuario selecciona la tarea por su número (comenzando desde 0).  
   - Los cambios se guardan automáticamente en el CSV.

4. **Salir del programa**

---

## 🧩 Estructura del Proyecto

```
crud/
│
├── src/
│   ├── Main.java          # Contiene el menú principal y la lógica del programa
│   ├── Tarea.java         # Clase que representa una tarea (nombre, estado)
│
├── tareas.csv             # Archivo CSV donde se almacenan las tareas (Se crea al ejecutar el programa)
│
└── README.md              # Este archivo
```

---

## 🧠 Conceptos aprendidos

- Lectura y escritura de archivos CSV con `File`, `FileWriter` y `Scanner`.  
- Uso de `ArrayList` para manejar colecciones dinámicas de objetos.  
- Manejo de clases y objetos (`Tarea`).  
- Modularización del código mediante métodos.  
- Control de flujo y menús en consola.

---
