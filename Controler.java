import java.util.Scanner;

public class Controler {
    private Parking estacionamiento;
    private String entry = "0", history;
    private int auto;
    Scanner read_entry = new Scanner(System.in);


    public void Controler() {
        this.estacionamiento = new Parking();
        while(!entry.equalsIgnoreCase("e")) {

            System.out.println("Ingrese el numero del vehículo que desea arrendar");
            entry = read_entry.next();

            auto = Integer.parseInt(entry);

            if (estacionamiento.getEstacion().get(auto).getEstado().equalsIgnoreCase("disponible") ) {

                estacionamiento.getEstacion().get(auto).setEstado("arrendado");
               history = "Usted ha arrendado un automovil marca : "+estacionamiento.getEstacion().get(auto).getModel() +
                       ", \ncon capacidad de combustible de: " + estacionamiento.getEstacion().get(auto).getTanque()+ " con " +
                       estacionamiento.getEstacion().get(auto).getKilometraje()+" kilometraje, \npor favor al termino de su " +
                       "jornada estacionar/devolver el automovil en el lugar " + auto +".";
               System.out.println(history);
            }
            else{
                System.out.println("El auto que ha seleccionado no se encuentra disponible.");
            }
            System.out.println("Si desea salir de la interfaz ingrse la letra 'e'\nSi desea continuar presione cualquier otra tecla");
            entry = read_entry.next();

        }
    }



}
