import java.util.ArrayList;

public class Parking {
    private ArrayList<Auto> estacion = new ArrayList<Auto>(10);
    private Auto car;

    public ArrayList<Auto> getEstacion() {
        for (int i = 0; i < 10; i++) {

            car = new Auto();
            car.getModo();
            estacion.add(car);

        }

        return estacion;
    }


}