# Diseño de la Clase Vehiculo

## Atributos

- **modelo**: Indica el modelo del vehículo.
- **marca**: Indica la marca del vehículo.
- **tipoMotor**: Valor aceptado: “combustion” o “electrico”.
- **kilometrosRestantes**: Kilómetros que el vehículo puede recorrer.
- **esTransformer**: Booleano que indica si el vehículo es un transformer.

## Funcionalidades (Métodos)

- **conducir(int kmRecorridos)**: Resta los kilómetros recorridos al valor de kilometrosRestantes, siempre que haya una cantidad suficiente disponible.
