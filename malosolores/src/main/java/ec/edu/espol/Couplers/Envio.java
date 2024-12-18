package ec.edu.espol.Couplers;

public class Envio {
// Mal Olor: Message Chains
    // Necesitamos obtener el código postal del gerente de la empresa para el envío
    public void enviarPaquete(Empresa empresa) {
        // Esto es un ejemplo de "Message Chains" ya que estamos llamando a múltiples métodos en cadena
        String codigoPostal = empresa.getGerente().getDireccion().getCodigoPostal();
        System.out.println("Enviando paquete al código postal: " + codigoPostal);
    }
}
