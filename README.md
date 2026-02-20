# Problema de los jarros de agua (Water Jug Problem)

Proyecto Java que resuelve el clásico problema de los jarros (botes)
utilizando búsqueda en anchura (BFS). El ejemplo implementa dos jarros con
capacidades 3 (X) y 4 (Y) litros y busca una secuencia de acciones que
lleve del estado inicial al estado objetivo.

## Enfoque

- Se modela cada configuración como un `State` (`x`,`y`).
- `Node` representa un nodo del árbol de búsqueda con referencia al padre y la acción aplicada.
- Se realiza búsqueda por niveles (BFS) desde el estado inicial hasta encontrar el estado objetivo. 
- Cuando se encuentra, se reconstruye el camino mediante las referencias `parent`.

Las operaciones soportadas son:
- Vaciar X, Vaciar Y
- Llenar X (capacidad 3), Llenar Y (capacidad 4)
- Pasar X -> Y, Pasar Y -> X

## Estructura del proyecto

- `src/main/java/com/eli/` contiene las clases principales:
  - `App.java` - punto de entrada y algoritmo BFS
  - `Node.java` - representación de nodos y generación de hijos
  - `State.java` - estado (x,y)
  - `Validations.java` - utilidades de validación y búsqueda auxiliar

- `tree.json` (generado) — representación JSON del árbol para visualización.

## Cómo compilar y ejecutar

Requisitos: Java (la versión configurada en `pom.xml`, actualmente `release 25`) y Maven.

Compilar y ejecutar con Maven:

```bash
mvn package
java -cp target/classes com.eli.App
```

El programa escribe `tree.json` en la raíz del proyecto; puedes visualizarlo en 
https://jsoncrack.eliyya.dev/editor o en https://jsoncrack.com/editor pegando el contenido.

## Generar la documentación Javadoc

Puedes generar la documentación Javadoc con Maven:

```bash
mvn javadoc:javadoc
```

La salida estará en `target/site/apidocs`.

## Notas

- El `pom.xml` incluye `--enable-preview` y `release 25`. Asegúrate de
  tener la JDK adecuada si quieres compilar tal cual.
- El algoritmo implementado es una BFS simple; no se ha optimizado para
  re-visitar estados (podrías mejorar evitando estados repetidos).
