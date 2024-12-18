package ec.edu.espol.Couplers;

public class ResumenLibro {
    private BibliotecaExterna libro;

    public ResumenLibro(BibliotecaExterna libro) {
        this.libro = libro;
    }

    public String generarResumen() {
        // Aquí el código depende demasiado de los detalles internos de la clase BibliotecaExterna
        // lo que sugiere "Feature Envy"
        String titulo = libro.getTitulo();
        String autor = libro.getAutor();
        String resumen = "Resumen del libro " + titulo + " por " + autor;

        // Aquí también se demuestra "Inappropriate Intimacy" porque estamos accediendo a detalles internos que quizá no deberíamos.
        return resumen;
    }
}
