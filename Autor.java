// Clase publica llamada Autor.
public class Autor {
    
    // Variables de instancia de tipo String llamadas nombre y apellido.
    private String nombre;
    private String apellido;
    
    // Constructor que recibe el nombre y el apellido del autor e iniciar las variables de instancia.
    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // Metodo mostrarNombre() que, al ser llamado muestra el nombre completo del autor.
    public String mostrarNombre() {
        return "Autor: " + nombre + " " + apellido;
    } 
    
}
