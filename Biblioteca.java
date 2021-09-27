

public class Biblioteca {
    
    // Instancias de clase == Objetos
    public static void main(String[] args) {
        
        //Primer libro
        Libro libroUno = new Libro("La insoportable levedad del ser", new Autor("Milan", "Kundera"), "35128", 336);
        libroUno.mostrarTitulo();
        libroUno.mostrarAutor();
        libroUno.mostrarNumPaginas();
        libroUno.mostrarIsbn();
        
        // Segundo libro
        Libro libroDos = new Libro("La metamorfosis", new Autor("Franz", "Kafka"), "36995", 224);
        libroDos.mostrarTitulo();
        libroUno.mostrarAutor();
        libroDos.mostrarNumPaginas();
        libroDos.mostrarIsbn();
        
        // Tercer libro
        Libro libroTres = new Libro("El hombre duplicado", new Autor("Jose", "Saramago"), "16998", 407);
        libroTres.mostrarTitulo();
        libroTres.mostrarAutor();
        libroTres.mostrarNumPaginas();
        libroTres.mostrarIsbn();
    }
}
