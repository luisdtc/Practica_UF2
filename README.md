# Práctica UF2

Practica ICB0005-UF2-PR01-grupo5


## Requisitos funcionales del Vehículo

| Atributo            | Tipo   | Descripción                         |
|---------------------|--------|-------------------------------------|
| marca               | String | Fabricante (p. ej. “Seat”)          |
| modelo              | String | Modelo (“Ibiza”)                    |
| velocidadActual     | int    | Velocidad instantánea (km/h)        |
| velocidadMaxima     | int    | Límite físico (km/h)                |

### Métodos

| Método                         | Descripción                                                          |
|--------------------------------|----------------------------------------------------------------------|
| **acelerar(int inc)**          | Suma `inc` a `velocidadActual` sin superar `velocidadMaxima`.        |
| **frenar(int dec)**            | Resta `dec`; nunca baja de 0.                                        |
| **parar()**                    | Pone `velocidadActual` a 0.                                          |
| **esDeportivo() : boolean**    | `true` si `velocidadMaxima` ≥ 200 km/h.                              |

Se ha trabajado la funcionalidad de `acelerar(int)` en la rama:

feature/acelerar

yaml
Copiar
Editar

En ella se ha implementado el método `acelerar` y su correspondiente suite de tests.

---

## 🔬 Tests realizados (JUnit 5)

Los tests están contenidos en la clase `VehiculoAcelerarTest` y cubren los siguientes casos:

| Código       | Caso de prueba                                                 |
|--------------|----------------------------------------------------------------|
| `TC_AC_01`   | Aceleración válida (suma de 10 km/h, sin exceder límite)      |
| `TC_AC_02`   | Aceleración que excede la velocidad máxima (ajuste al tope)   |
| `TC_AC_03`   | Valor negativo no modifica la velocidad y muestra un mensaje  |

Los tests siguen las convenciones de TDD (Red → Green → Refactor), y están correctamente nombrados para trazabilidad.

---

## ⚙️ Implementación actual

Se ha implementado:

- Constructor básico que inicializa marca, modelo y velocidad máxima
- Valor inicial de `velocidadActual` en 0
- Método `acelerar(int)` con validación y lógica de límite