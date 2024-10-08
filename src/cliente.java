import java.time.LocalDate;

public class cliente extends GestionAlquileres{
    private String nombre;
    private String dni;
    private boolean tieneRegistroConducir;

    public cliente(String dni, String nombre, boolean tieneRegistroConducir) {
        this.dni = dni;
        this.nombre = nombre;
        this.tieneRegistroConducir = tieneRegistroConducir;
    }


    public boolean puedeAlquilar() {
        return tieneRegistroConducir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isTieneRegistroConducir() {
        return tieneRegistroConducir;
    }

    public void setTieneRegistroConducir(boolean tieneRegistroConducir) {
        this.tieneRegistroConducir = tieneRegistroConducir;
    }
}