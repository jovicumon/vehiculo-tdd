import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VehiculoTest {

    @Test
    public void testConducirReduceKilometrosDisponibles() {
        // Se crea un vehículo con 200 km disponibles
        Vehiculo vehiculo = new Vehiculo("Corolla", "Toyota", "combustion", 200, false);
        vehiculo.conducir(50);
        int kmRestantes = vehiculo.getKilometrosRestantes();
        System.out.println("Kilómetros restantes después de conducir: 150");
        // Se espera que los kilómetros restantes disminuyan a 150
        assertEquals(150, vehiculo.getKilometrosRestantes());
    }

    @Test
    public void testConducirConMasKmQueDisponibles() {
        // Se crea un vehículo con 100 km disponibles
        Vehiculo vehiculo = new Vehiculo("Model S", "Tesla", "electrico", 100, false);
        // Al intentar conducir 150 km, por ejemplo, se debería notificar que no se pueden recorrer esos km
        // Dependiendo de la implementación, podríamos no modificar el valor o lanzar una excepción.
        // Para este ejemplo, asumiremos que no se realiza la operación.
        vehiculo.conducir(150);
        // Se espera que los kilómetros no cambien
        assertEquals(100, vehiculo.getKilometrosRestantes());
    }

    @Test
    public void testConducirExcedeKilometrajeDisponible() {
        // Se crea un vehículo con 100 km disponibles
        Vehiculo vehiculo = new Vehiculo("Model S", "Tesla", "electrico", 100, false);
        vehiculo.conducir(150);
        // Se espera que los kilómetros permanezcan en 100
        assertEquals(100, vehiculo.getKilometrosRestantes());
    }

    @Test
    public void testValorNegativoEnConducir() {
        Vehiculo vehiculo = new Vehiculo("Civic", "Honda", "combustion", 100, false);
        // Se espera que al intentar conducir un valor negativo, se lance una excepción.
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            vehiculo.conducir(-10);
        });
        String expectedMessage = "El número de kilómetros recorridos debe ser positivo";
        String actualMessage = exception.getMessage();
        System.out.println("Mensaje de excepción: " + actualMessage);
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testEsTransformer() {
        // Crea un vehículo que sea un Transformer.
        Vehiculo vehiculo = new Vehiculo("Optimus Prime", "Transformers", "electrico", 500, true);
        boolean esTransformer = vehiculo.isEsTransformer();
        System.out.println ("Es un Transformer? " + (esTransformer ? "Si y mola" : "No"));
        // Se verifica que el getter isEsTransformer retorne true.
        assertTrue(vehiculo.isEsTransformer());
    }
    @Test
    public void testConstructorTipoMotorInvalido() {
        // Se espera que al pasar "hibrido" (valor inválido) en tipoMotor se lance una IllegalArgumentException.
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Vehiculo("Civic", "Honda", "hibrido", 100, false);
        });
        // Mensaje esperado definido en el constructor de Vehiculo.
        String expectedMessage = "El tipo de motor debe ser 'combustion' o 'electrico'";
        String actualMessage = exception.getMessage();
        System.out.println("Mensaje de excepción: " + actualMessage);
        // Verifica que el mensaje de la excepción contenga lo esperado.
        assertTrue(actualMessage.contains(expectedMessage));
    }

}
