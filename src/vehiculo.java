

class Vehiculo extends GestionAlquileres {
    private String modelo;
    private double kilometraje;
    private int anio;
    private int codigoInterno;
    private double tarifaDiaria;
    private tipoVehiculo tipo;

    public Vehiculo(String modelo, double kilometraje, int anio, int codigoInterno, double tarifaDiaria) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.anio = anio;
        this.codigoInterno = codigoInterno;
        this.tarifaDiaria = tarifaDiaria;
    }


    public double getTarifaDiaria() {
        return tarifaDiaria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setTarifaDiaria(double tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }

    public tipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(tipoVehiculo tipo) {
        this.tipo = tipo;
    }
}