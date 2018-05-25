import java.util.ArrayList;
import java.util.Scanner;

public class Diccionario {
    private ArrayList<Preguntas> cuestion = new ArrayList<Preguntas>();
    private Preguntas pregunta;
    private String entry = "0";
    int entero;
    Scanner read_entry = new Scanner(System.in);

    public void setCuestion{
        while (!entry.equals("1")){

            System.out.println("Ingrese una pregunta");
            entry = read_entry.next();
            pregunta.setPregunta(entry);
            System.out.println("Ingrese un puntaje para esta pregunta\nElija 10-20-30 ");
            entry = read_entry.next();
            entero = Integer.parseInt(entry);
            while (entero != 10 || entero != 20 || entero != 30){
                System.out.println("Valor no valido, ingrese nuevamente");
                entry = read_entry.next();
                entero = Integer.parseInt(entry);
            }
            pregunta.setPuntaje(entero);

            cuestion.add(pregunta);

            System.out.println("si desea continuar presione 0\nsi desea acabar presione 1");
            entry = read_entry.next();
        }
    }
   

    public ArrayList<Preguntas> getCuestion() {
        return cuestion;
    }
}
