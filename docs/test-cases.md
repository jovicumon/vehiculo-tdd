<table>
    <thead>
    <tr>
        <th>ID del Test</th>
        <th>Funcionalidad / Método</th>
        <th>Descripción</th>
        <th>Entrada(s)</th>
        <th>Resultado Esperado</th>
        <th>Notas/Observaciones</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>TC001</td>
        <td>Constructor</td>
        <td>Verificar creación correcta de un objeto Vehiculo con valores válidos</td>
        <td>modelo = "Corolla", marca = "Toyota", tipoMotor = "combustion", kilometrosRestantes = 200, esTransformer = false</td>
        <td>Objeto creado sin errores; getters retornan los valores esperados</td>
        <td>Validar que esTransformer sea false</td>
    </tr>
    <tr>
        <td>TC002</td>
        <td>Constructor</td>
        <td>Lanzar excepción con tipoMotor no válido</td>
        <td>tipoMotor = "híbrido"</td>
        <td>Se lanza IllegalArgumentException</td>
        <td>-</td>
    </tr>
    <tr>
        <td>TC003</td>
        <td>Constructor</td>
        <td>Lanzar excepción si kilometrosRestantes es negativo</td>
        <td>kilometrosRestantes = -50</td>
        <td>Se lanza IllegalArgumentException</td>
        <td>-</td>
    </tr>
    <tr>
        <td>TC004</td>
        <td>Getter y Setter</td>
        <td>Verificar que los setters actualizan correctamente los atributos</td>
        <td>Modificar modelo o cambiar tipoMotor y validar con getter</td>
        <td>El getter retorna el nuevo valor correctamente</td>
        <td>Probar también con esTransformer</td>
    </tr>
    <tr>
        <td>TC005</td>
        <td>Método conducir</td>
        <td>Conducir dentro de lo permitido</td>
        <td>Vehiculo con kilometrosRestantes = 200, conducir 50 km</td>
        <td>Los kilómetros restantes se actualizan a 150</td>
        <td>Validar que la resta se haga correctamente</td>
    </tr>
    <tr>
        <td>TC006</td>
        <td>Método conducir</td>
        <td>Intentar conducir más kilómetros de los disponibles</td>
        <td>Vehiculo con kilometrosRestantes = 100, conducir 150 km</td>
        <td>Los kilómetros permanecen en 100 y se muestra un mensaje de advertencia</td>
        <td>Definir si se ignora la operación o se lanza excepción</td>
    </tr>
    <tr>
        <td>TC007</td>
        <td>Método conducir</td>
        <td>Probar que conducir con valor negativo lanza excepción</td>
        <td>Conducir(-10)</td>
        <td>Se lanza IllegalArgumentException</td>
        <td>Revisar el mensaje de la excepción</td>
    </tr>
    </tbody>
</table>
