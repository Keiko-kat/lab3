import java.util.ArrayList;

public class Prueba {
    private ArrayList<Preguntas> cuestionario = new ArrayList<Preguntas>();
    private ArrayList<Preguntas> prueba = new ArrayList<Preguntas>(1);
    private Diccionario cuest = new Diccionario();
    private int limite, valor, posicion, iteracion = 0;

    public int getLimite() {
        limite = cuestionario.size();
        return limite;
    }
    public int getIteracion(){
        return iteracion;
    }

    public int getPosicion() {
        posicion = (int) ((Math.random() * limite));
        return posicion;
    }
    while(valor<100){
        prueba.add(cuestionario.get(posicion));
        valor = valor + prueba.get(iteracion).getPuntaje;
    }



    public int getValor() {
        return valor;
    }

    public ArrayList<Preguntas> getCuestionario() {
        cuestionario = cuest.getCuestion();
        return cuestionario;
    }

    public Diccionario getCuest() {

        return cuest;

    }

    public ArrayList<Preguntas> getPrueba() {
        return prueba;
    }

}


