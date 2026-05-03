# Ejercicios Tema 6 - Documentación

Proyecto de ejemplo para el ejercicio 5: simulador de partidos de fútbol por consola.

## Ejecutar

```bash
gradle run
```

En Windows:

```bash
gradle run
```

## Generar JavaDoc

```bash
gradle javadoc
```

La documentación se genera en:

```text
build/docs/javadoc/index.html
```

## Nota

El partido está configurado por defecto a 3 minutos reales y con pausa de 2 segundos entre jugadas, como pide el enunciado. Para probarlo rápido se puede cambiar temporalmente la duración en `SimuladorFutbolApp`.
