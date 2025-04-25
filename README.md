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
| `TC_AC_01`   | Aceleración válida (suma de 10 km/h, sin exceder límite)       |
| `TC_AC_02`   | Aceleración que excede la velocidad máxima (ajuste al tope)    |
| `TC_AC_03`   | Aceleración válida , intenta superar velocidad maxima          |


Los test están contenidos en la clase `VehículoFrenarTest` y cubren los siguientes casos:
| Código       | Caso de prueba                                                 |
|--------------|----------------------------------------------------------------|
| `TC_FR_01`   | El vehículo frena correctamente                                |
| `TC_FR_02`   | Decremento superior a velocidad; el vehículo se detiene        |
| `TC_FR_03`   | Freno inferior a velocidad; el vehículo no se detiene          |
| `TC_FR_04`   | El decremento es inválido, muestra error                       |

Los test están contenidos en la clase `VehículoPararTest` y cubren los siguientes casos:
| Código       | Caso de prueba                                                 |
|--------------|----------------------------------------------------------------|
| `TC_PA_01`   | Velocidad pasa a 0; detiene el vehículo                        |
| `TC_PA_02`   | El vehículo ya está parado                                     |

Los test están contenidos en la clase `VehiculoEsDeportivoTest` y cubren los siguientes casos:
| Código       | Caso de prueba                                                 |
|--------------|----------------------------------------------------------------|
| `TC_DE_01`   | Valor supera el mínimo para cumplir requisito                  |
| `TC_DE_002`  | Valor insuficiente para cumplir requisito                      |



Los tests siguen las convenciones de TDD (Red → Green → Refactor), y están correctamente nombrados para trazabilidad.

---

## ⚙️ Implementación actual

Se ha implementado:

- Constructor básico que inicializa marca, modelo y velocidad máxima
- Valor inicial de `velocidadActual` en 0
- Método `acelerar(int)` con validación y lógica de límite
