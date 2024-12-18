package ec.edu.espol.Couplers;

public class BibliotecaExterna {
    private String titulo;
    private String autor;

    public BibliotecaExterna(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // Aquí nos falta un método para obtener el número de páginas, por lo que tendremos que extender esta clase o escribir código adicional en otro lugar.
}
