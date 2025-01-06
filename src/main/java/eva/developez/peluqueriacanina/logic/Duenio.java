package eva.developez.peluqueriacanina.logic;

/**
 *
 * @author Eva Lopez
 */
public class Duenio {
    
    // Atributos
    private int id_duenio;
    private String nombreDuenio;
    private String telefono;
    
    // Constructores

    // constructor vacio
    public Duenio() {
    }
    // Constructor con parametros
    public Duenio(int id_duenio, String nombreDuenio, String telefono) {
        this.id_duenio = id_duenio;
        this.nombreDuenio = nombreDuenio;
        this.telefono = telefono;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
    
    
}
