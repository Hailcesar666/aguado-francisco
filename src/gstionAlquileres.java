import java.time.LocalDate;
import java.util.ArrayList;

class GestionAlquileres {


    private ArrayList<alquiler> listaAlquileres;

    public GestionAlquileres() {
        this.listaAlquileres = new ArrayList<>();
    }


    public void agregarAlquiler(alquiler alquiler) {
        listaAlquileres.add(alquiler);
    }


    public void imprimirAlquileres() {
        for (alquiler alquiler : listaAlquileres) {
            System.out.println("Alquiler código: " + alquiler);
        }
    }

    public void contarAlquileresPorTipo() {
        int conteo2Puertas = 0, conteo4Puertas = 0, conteoCamioneta = 0;
        for (alquiler alquiler : listaAlquileres) {
            switch (alquiler.gettipo) {
                case "2PUERTAS":
                    conteo2Puertas++;
                    break;
                case "4PUERTAS":
                    conteo4Puertas++;
                    break;
                case "CAMIONETA":
                    conteoCamioneta++;
                    break;
            }
        }
        System.out.println("Alquileres 2 Puertas: " + conteo2Puertas);
        System.out.println("Alquileres 4 Puertas: " + conteo4Puertas);
        System.out.println("Alquileres Camioneta: " + conteoCamioneta);
    }


    public alquiler alquilerMayorCosto() {
        alquiler mayorCosto = null;
        for (alquiler alquiler : listaAlquileres) {
            if (mayorCosto == null || alquiler.getCosto() > mayorCosto.getCosto()) {
                mayorCosto = alquiler;
            }
        }
        return mayorCosto;
    }


    public void contarAlquileresPorTipo() {
        int conteo2Puertas = 0, conteo4Puertas = 0, conteoCamioneta = 0;
        for (alquiler alquiler : listaAlquileres) {
            switch (alquiler.getVehiculo().getTipo()) {
                case "2PUERTAS":
                    conteo2Puertas++;
                    break;
                case "4PUERTAS":
                    conteo4Puertas++;
                    break;
                case "CAMIONETA":
                    conteoCamioneta++;
                    break;
            }
        }
        System.out.println("Alquileres 2 Puertas: " + conteo2Puertas);
        System.out.println("Alquileres 4 Puertas: " + conteo4Puertas);
        System.out.println("Alquileres Camioneta: " + conteoCamioneta);
    }
}








