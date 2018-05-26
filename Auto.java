public class Auto {
    private String model, estado = "disponible";
    private int kilometraje, tanque, modo;

    public int getModo() {
        modo = (int)((Math.random() *3)+1);
        return modo;
    }

    public int getKilometraje() {
        kilometraje = (int)(Math.random() *2001);
        return kilometraje;
    }

    public String getModel() {
        if (modo == 1){
            this.model = "Peugeot 207";
        }
        if (modo == 2){
            this.model = "Mazda 2";
        }
        if (modo == 3){
            this.model = "Jeep Full";
        }
        return model;
    }


    public int getTanque() {
        if (modo == 1){
            this.tanque = 40;
        }
        if (modo == 2){
            this.tanque = 20;
        }
        if (modo == 3){
            this.tanque = 60;
        }
        return tanque;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
