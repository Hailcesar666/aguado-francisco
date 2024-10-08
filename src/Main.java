

/*Desarrolle un sistema para una empresa que alquila vehículos a clientes
particulares. La empresa alquila 3 tipos de vehículos (2PUERTAS, 4PUERTAS y
CAMIONETA). Todos los vehículos tienen un modelo, kilometraje, año y código interno.
También cuentan con una tarifa fija por día.
Para realizar un nuevo alquiler se debe solicitar al cliente: Nombre completo, DNI y
tiene que tener registro para conducir. Si el cliente cumple con estas condiciones, se
genera un nuevo alquiler y se selecciona el vehículo en cuestión.
El alquiler también cuenta con una fecha de inicio y una fecha final. Para el cálculo
total del costo se debe tener en cuenta la cantidad de kilómetros que realizó el cliente
sobre el vehículo más la cantidad de días rentado. El costo fijo del kilómetro es de $50
Como la empresa cuenta con varias sucursales dentro del país, el cliente puede
rentar un auto en una sucursal y retornarlo en otra distinta. A modo de información, cada
sucursal tiene: Ciudad, dirección y número de teléfono.*/


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Sucursal sucursal1 = new Sucursal(1, "MDP", "LAVALLE 3004", "223619687");
        Sucursal sucursal2 = new Sucursal(2, "BAIRES", "LYNCH 2000", "78456256");


        Vehiculo vehiculo1 = new Vehiculo("Modelo 2P", 10000, 2020, 1, 200);
        Vehiculo vehiculo2 = new Vehiculo("Modelo 4P", 20000, 2021, 2, 250);
        Vehiculo vehiculo3 = new Vehiculo("Camioneta X", 50000, 2019, 3, 300);


        cliente cliente = new cliente("Juan Pérez", "12345678", true);


        GestionAlquileres gestionAlquileres = new GestionAlquileres();



        if (cliente.puedeAlquilar()) {

            alquiler alquiler1;
            alquiler1 = new alquiler(1, LocalDate.now(), LocalDate.now().plusDays(5) ,vehiculo1  150, sucursal1, sucursal2);
            alquiler alquiler2 = new alquiler(2, LocalDate.now(), LocalDate.now().plusDays(7), vehiculo2, 200, sucursal2, sucursal1);
            alquiler alquiler3 = new alquiler(3, LocalDate.now(), LocalDate.now().plusDays(3), vehiculo3, 300, sucursal1, sucursal2);


            gestionAlquileres.agregarAlquiler(alquiler1);
            gestionAlquileres.agregarAlquiler(alquiler2);
            gestionAlquileres.agregarAlquiler(alquiler3);


            alquiler mayorCosto = gestionAlquileres.alquilerMayorCosto();
            System.out.println("Alquiler con mayor costo: " + mayorCosto);


            gestionAlquileres.contarAlquileresPorTipo();
        } else {
            System.out.println("El cliente no tiene un registro válido para conducir.");
        }
    }


}