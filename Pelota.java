# Soluciones de los ejercicios 1, 2, 3, 4 y 6

## Ejercicio 1. Detección de errores en JavaDoc

### Errores encontrados

1. La descripción de la clase es demasiado pobre: solo pone “Clase”.
2. El correo del autor parece personal y no es necesario para la documentación.
3. Falta `@version` en la clase.
4. El método `sumar` tiene una descripción demasiado corta: “suma”.
5. En `sumar` se documenta `@param x`, pero el método realmente usa `a` y `b`.
6. Falta documentar el parámetro `b` de `sumar`.
7. `@return` está vacío en `sumar`.
8. En `dividir`, los parámetros `a` y `b` no están bien explicados.
9. En `dividir`, se indica `@throws Exception`, pero el método lanza `ArithmeticException`.
10. Faltan tildes y descripciones claras en varios comentarios.

### Código corregido

```java
/**
 * Clase que permite realizar operaciones matemáticas básicas.
 *
 * @author Germán Gascón
 * @version 1.0
 */
public class Calculadora {

    /**
     * Suma dos números enteros.
     *
     * @param a Primer número de la suma
     * @param b Segundo número de la suma
     * @return Resultado de sumar {@code a} y {@code b}
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Divide dos números enteros.
     *
     * @param a Dividendo de la operación
     * @param b Divisor de la operación
     * @return Resultado de dividir {@code a} entre {@code b}
     * @throws ArithmeticException Si el divisor es cero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }
}
```

## Ejercicio 2. Documentación de una clase

```java
/**
 * Clase que representa un temporizador sencillo expresado en segundos.
 *
 * @author Alumno
 * @version 1.0
 */
public class Temporizador {

    /**
     * Cantidad actual de segundos del temporizador.
     */
    private int segundos;

    /**
     * Crea un temporizador con una cantidad inicial de segundos.
     *
     * @param segundosIniciales Valor inicial del temporizador
     */
    public Temporizador(int segundosIniciales) {
        this.segundos = segundosIniciales;
    }

    /**
     * Aumenta el temporizador con los segundos indicados.
     *
     * @param segundosExtra Segundos que se añaden al temporizador
     * @throws IllegalArgumentException Si los segundos extra son negativos
     */
    public void incrementar(int segundosExtra) {
        if (segundosExtra < 0) {
            throw new IllegalArgumentException("No se permiten valores negativos");
        }
        segundos += segundosExtra;
    }

    /**
     * Reinicia el temporizador a cero segundos.
     */
    public void reiniciar() {
        segundos = 0;
    }

    /**
     * Devuelve los segundos actuales del temporizador.
     *
     * @return Cantidad actual de segundos
     */
    public int getSegundos() {
        return segundos;
    }
}
```

## Ejercicio 3. Selección de etiquetas adecuadas

a) Método que recibe dos parámetros y devuelve un valor:  
`@param` para explicar cada parámetro y `@return` para explicar el valor que devuelve.

b) Método que puede lanzar `IllegalArgumentException`:  
`@throws IllegalArgumentException` para indicar en qué caso se produce la excepción.

c) Clase pública de una biblioteca que empezó a existir en la versión 2.0:  
`@since 2.0` para indicar desde qué versión existe esa clase.

d) Método obsoleto que debe sustituirse por otro:  
`@deprecated` para avisar de que no debe usarse. También se puede añadir `{@link ...}` para enlazar con el método recomendado.

e) Método cuya documentación necesita enlazar con otro método relacionado:  
`@see` o `{@link ...}`. `@see` sirve como referencia externa al final de la documentación y `{@link ...}` permite insertar el enlace dentro de una frase.

f) Clase cuyo autor y versión deben mostrarse en la documentación:  
`@author` y `@version`.

## Ejercicio 4. Evaluación de la documentación de jsoup

1. **¿El README explica claramente qué es el proyecto y para qué sirve?**  
Sí. El README explica que jsoup es una biblioteca Java para trabajar con HTML y XML reales. También indica que permite obtener URLs, parsear documentos, extraer datos y manipular contenido mediante DOM, selectores CSS y XPath.

2. **¿Incluye instrucciones de uso o ejemplos?**  
Sí. El README incluye una descripción inicial, ejemplos de uso y enlaces a documentación. Esto ayuda a entender rápidamente cómo empezar a usar la biblioteca.

3. **¿La documentación API es fácil de navegar?**  
Sí. La documentación JavaDoc está organizada por paquetes, clases y métodos. Además, incluye buscador, índices y enlaces entre elementos, por lo que resulta bastante cómoda para desarrolladores.

4. **¿Los nombres de clases y métodos resultan claros?**  
En general sí. Nombres como `Jsoup`, `Document`, `Element`, `parse`, `select` o `connect` son bastante expresivos y ayudan a intuir qué hace cada parte.

5. **¿La documentación está orientada a desarrolladores?**  
Sí. Está claramente pensada para desarrolladores Java, porque explica clases, métodos, parámetros, valores devueltos y ejemplos de uso de la API.

6. **¿Qué aspectos mejorarías del README?**  
Añadiría una guía rápida más visual, con un ejemplo completo desde la instalación hasta la extracción de datos. También separaría mejor los casos de uso más habituales: parsear HTML, seleccionar elementos, limpiar HTML y descargar una página.

7. **¿Qué aspectos mejorarías del JavaDoc o documentación API?**  
Añadiría más ejemplos cortos en algunos métodos importantes. La documentación API es completa, pero en métodos muy usados sería útil ver ejemplos directos para no tener que buscar en otras páginas.

## Ejercicio 6. Uso crítico de la IA para la documentación de código

Para este ejercicio usaría la clase `Equipo`, porque tiene varios atributos y métodos.

### Código usado

```java
public class Equipo {

    private String nombre;
    private Jugador[] jugadores;
    private int goles;

    public Equipo(String nombre, Jugador[] jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        this.goles = 0;
    }

    public Jugador getJugador(int indice) {
        return jugadores[indice];
    }

    public void intercambiarJugadores(int indiceA, int indiceB) {
        Jugador aux = jugadores[indiceA];
        jugadores[indiceA] = jugadores[indiceB];
        jugadores[indiceB] = aux;
    }

    public void marcarGol() {
        goles++;
    }

    public int getGoles() {
        return goles;
    }
}
```

### Revisión crítica

La IA entendió la idea general de la clase, pero la documentación que generó era demasiado genérica. Por ejemplo, decía “gestiona un equipo” sin explicar que el equipo forma parte de un simulador de fútbol. También faltaba contexto sobre el array de 11 jugadores y no siempre explicaba bien los índices.

### Problemas detectados

- Algunas descripciones eran demasiado evidentes.
- No explicaba que el array debe tener 11 jugadores.
- No indicaba posibles errores si se usa un índice fuera del rango.
- En algunos casos inventaba validaciones que el código no tenía.
- Faltaba explicar para qué se usa `intercambiarJugadores`.

### Documentación corregida

La versión corregida está en el archivo `Equipo.java` del proyecto, donde se documentan la clase, atributos, constructor, métodos públicos y posibles excepciones.

### Preguntas de reflexión

**¿La IA entendió correctamente el propósito del código?**  
Lo entendió de forma general, pero no captó todos los detalles del simulador.

**¿La documentación generada era demasiado genérica?**  
Sí. Algunas frases podrían servir para casi cualquier clase.

**¿Había información incorrecta o inventada?**  
Sí. Puede inventar validaciones o excepciones que realmente no aparecen en el código.

**¿Qué partes he tenido que corregir?**  
He corregido las descripciones, los parámetros, el contexto del simulador y las excepciones que podían producirse.

**¿En qué situaciones puede ayudar la IA y en cuáles no conviene confiar sin revisar?**  
Puede ayudar a crear una primera versión de la documentación, pero no conviene confiar sin revisar cuando el código tiene reglas concretas, excepciones, validaciones o decisiones importantes de diseño.
