public class Vehiculo {
    // Atributos básicos
    private String modelo;
    private String marca;
    private String tipoMotor;      // "combustion" o "electrico"
    private int kilometrosRestantes;

    // Atributo extra para saber si es un transformer
    private boolean esTransformer;

    // Constructor actualizado que incluye el atributo esTransformer
    public Vehiculo(String modelo, String marca, String tipoMotor, int kilometrosRestantes, boolean esTransformer) {
        this.modelo = modelo;
        this.marca = marca;

        // Validar el tipo de motor
        if (tipoMotor.equalsIgnoreCase("combustion") || tipoMotor.equalsIgnoreCase("electrico")) {
            this.tipoMotor = tipoMotor.toLowerCase();
        } else {
            throw new IllegalArgumentException("El tipo de motor debe ser 'combustion' o 'electrico'");
        }

        if (kilometrosRestantes < 0) {
            throw new IllegalArgumentException("Los kilómetros restantes no pueden ser negativos");
        }
        this.kilometrosRestantes = kilometrosRestantes;

        // Indica si es o no un transformer
        this.esTransformer = esTransformer;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public int getKilometrosRestantes() {
        return kilometrosRestantes;
    }

    public boolean isEsTransformer() {
        return esTransformer;
    }

    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipoMotor(String tipoMotor) {
        if (tipoMotor.equalsIgnoreCase("combustion") || tipoMotor.equalsIgnoreCase("electrico")) {
            this.tipoMotor = tipoMotor.toLowerCase();
        } else {
            throw new IllegalArgumentException("El tipo de motor debe ser 'combustion' o 'electrico'");
        }
    }

    public void setKilometrosRestantes(int kilometrosRestantes) {
        if (kilometrosRestantes < 0) {
            throw new IllegalArgumentException("Los kilómetros restantes no pueden ser negativos");
        }
        this.kilometrosRestantes = kilometrosRestantes;
    }

    public void setEsTransformer(boolean esTransformer) {
        this.esTransformer = esTransformer;
    }

    // Métod para simular la conducción: se restan los kilómetros recorridos
    public void conducir(int kmRecorridos) {
        if (kmRecorridos < 0) {
            throw new IllegalArgumentException("Los kilómetros recorridos deben ser positivos");
        }
        if (kmRecorridos > kilometrosRestantes) {
            System.out.println("No hay suficientes kilómetros restantes para recorrer esa distancia.");
        } else {
            kilometrosRestantes -= kmRecorridos;
        }
    }
}
