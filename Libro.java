// Clase publica Libro
public class Libro {
    
    // Variables de instancia que definen los atributos que tendra el libro.
    private String titulo;
    private final Autor autor;
    private String isbn;
    private int numPaginas;
    
    // Metodo constructor. Recibe el titulo del libro, el ISBN, nombre y apellido del autor, e inicializar estas variables.
    public Libro (String titulo, Autor autor, String isbn, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
    }
    
    // Metodo cambiarNumPaginas() que actualice el numero de paginas del libro. Setter->Modifica un valor.
    public void cambiarNumPaginas(int nuevoNumPaginas) {
        this.numPaginas = nuevoNumPaginas;
    }
    
    // Mostrar el numero de paginas del libro mediante un metodo.
    public void mostrarNumPaginas() {
        System.out.println("Numero de paginas: " + numPaginas);
    }
    
    // Mostrar el numero ISBN del libro.
    public void mostrarIsbn() {
        System.out.println("ISBN: " + isbn + "\n" + "\n");
    }
    
    // Mostrar el titulo del libro.
    public void mostrarTitulo() {
        System.out.println("Titulo del libro: " + titulo);
    }
    
    // Mostrar el autor del libro con el metodo de la clase Autor.
    public void mostrarAutor() {
        System.out.println(autor.mostrarNombre());
    }
}
