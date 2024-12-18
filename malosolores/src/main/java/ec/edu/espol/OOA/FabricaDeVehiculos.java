//Switch Statement
package ec.edu.espol.OOA;

public class FabricaDeVehiculos {
    public Vehiculo crearVehiculo(String tipo, String numeroRegistro, double velocidad) {
        switch (tipo) {
            case "coche":
                return new Carro(numeroRegistro, velocidad, "gasolina", 5.0);
            case "bicicleta":
                return new Bicicleta(numeroRegistro, (int) velocidad, "normal", 2);
            case "barco":
                return new Barco(numeroRegistro, velocidad, 10.0);
            default:
                throw new IllegalArgumentException("Tipo de vehículo desconocido");
        }
    }
}
