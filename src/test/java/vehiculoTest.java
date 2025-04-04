import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VehiculoTest {

    @Test
    public void testConducirReduceKilometrosDisponibles() {
        // Se crea un vehículo con 200 km disponibles
        Vehiculo vehiculo = new Vehiculo("Corolla", "Toyota", "combustion", 200, false);
        vehiculo.conducir(50);
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
}
