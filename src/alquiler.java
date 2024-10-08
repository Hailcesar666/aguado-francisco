import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class alquiler extends GestionAlquileres {
    private int codigo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double kilometrosRecorridos;
    private Vehiculo vehiculo;
    private static final double COSTO_POR_KM = 50;

    public alquiler(int codigo, LocalDate fechaInicio, LocalDate fechaFin, double kilometrosRecorridos, Vehiculo vehiculo) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.vehiculo = vehiculo;
    }

    public double calcularCosto() {
        long diasAlquilado = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        double costoKilometros = kilometrosRecorridos * COSTO_POR_KM;
        double costoDias = diasAlquilado * vehiculo.getTarifaDiaria();
        return costoKilometros + costoDias;

    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
