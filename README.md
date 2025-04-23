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
