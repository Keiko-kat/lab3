import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Parking estacionamiento;
    private String entry = "0", history;
    private int auto, kilo, dif, dia, mes;
    private ArrayList<String> historial = new ArrayList<String>();
    Scanner read_entry = new Scanner(System.in);


    public void Controler() {
        this.estacionamiento = new Parking();
        while(!entry.equalsIgnoreCase("e")) {

            dif = (int)(Math.random()*20);
            mes = (int)(Math.random()*12);
            dia = (int)(Math.random()*28);
            kilo = (int)(Math.random()*2000);

            System.out.println("Ingrese el numero del vehículo que desea arrendar");
            entry = read_entry.next();

            auto = Integer.parseInt(entry);


            history = "Usted ha arrendado un automovil marca : "+estacionamiento.getEstacion().get(auto).getModel() +
                    ", \ncon capacidad de combustible de: " + estacionamiento.getEstacion().get(auto).getTanque()+ " con " +
                    estacionamiento.getEstacion().get(auto).getKilometraje()+" kilometraje, \npor favor al termino de su " +
                    "jornada estacionar/devolver el automovil en el lugar " + auto +".";
            System.out.println(history);

            history = "Usted ha arrendado un automovil marca : "+estacionamiento.getEstacion().get(auto).getModel() +
                    ", \ncon capacidad de combustible de: " + estacionamiento.getEstacion().get(auto).getTanque()+ " con " +
                    estacionamiento.getEstacion().get(auto).getKilometraje()+" kilometraje, y lo devolvıo con "
                    + (estacionamiento.getEstacion().get(auto).getTanque() - dif ) +
                    " capacidad de combustible y \n"+(estacionamiento.getEstacion().get(auto).getKilometraje() + kilo)+
                    " kilometraje con fecha " +dia+"/"+ mes;

            historial.add(history);

            for(int k= 0; k< historial.size();k++){
                System.out.println(historial.get(k));
            }
            System.out.println("Si desea salir de la interfaz ingrse la letra 'e'\nSi desea continuar presione cualquier otra tecla");
            entry = read_entry.next();

        }
    }
}
