package ec.edu.espol.Bloaters;

public class GestionEmpleado {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private double salario;
    private String departamento;

    // Lista larga de parámetros (Long Parameter List) en el constructor
    public GestionEmpleado(String nombre, String apellido, int edad, String direccion, double salario, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.salario = salario;
        this.departamento = departamento;
    }
    
    // Método largo (Long Method) que realiza múltiples tareas
    public void procesarEmpleado(String idEmpleado, String nombreDepartamento, double salarioMensual, int horasTrabajadas, int horasExtras, String direccionEmpleado) {
        // Calcular salario total
        double salarioTotal = salarioMensual + (horasExtras * 20);
        
        // Validar horas trabajadas
        if (horasTrabajadas > 40) {
            System.out.println("El empleado ha trabajado horas extras.");
        }

        // Imprimir detalles del empleado
        System.out.println("ID del empleado: " + idEmpleado);
        System.out.println("Nombre del departamento: " + nombreDepartamento);
        System.out.println("Salario mensual: " + salarioMensual);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Horas extra: " + horasExtras);
        System.out.println("Salario total: " + salarioTotal);
        System.out.println("Dirección del empleado: " + direccionEmpleado);

        // Realizar algunas otras operaciones con los datos del empleado
        if (departamento.equals(nombreDepartamento)) {
            System.out.println("El empleado pertenece al mismo departamento.");
        } else {
            System.out.println("El empleado pertenece a un departamento diferente.");
        }

        if (direccion.equals(direccionEmpleado)) {
            System.out.println("El empleado vive en la misma dirección registrada.");
        } else {
            System.out.println("El empleado ha cambiado de dirección.");
        }
    }

    // Método con aglomeración de datos (Data Clumps)
    public void actualizarDireccionEmpleado(String calle, String ciudad, String codigoPostal, String pais) {
        this.direccion = calle + ", " + ciudad + ", " + codigoPostal + ", " + pais;
    }
}