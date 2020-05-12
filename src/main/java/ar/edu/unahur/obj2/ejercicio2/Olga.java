package ar.edu.unahur.obj2.ejercicio2;

public class Olga {

    private boolean semillas;
    private boolean integral;
    private int nivelDetostado;


    public Olga(boolean semillas, boolean integral, int nivelDetostado) {
        this.semillas = semillas;
        this.integral = integral;
        this.nivelDetostado = nivelDetostado;
    }

    public void hornear(){
        if(isIntegral()){
            prepararPanIntegral();
        }else
            prepararPanBlanco();

        if(isSemillas()){
            System.out.println("Por favor agregue las semillas");
        }
        for (int i = 0; i < nivelDetostado; i++) {
            hornearElPan();
        }
    }

    private void hornearElPan() {
        System.out.println("Horneando el pan");
    }

    private void prepararPanBlanco() {
        System.out.println("Por favor agregue harina");
        System.out.println("Por favor agregue leche");
        System.out.println("Por favor agregue agua");
        System.out.println("Por favor agregue margarina");
        System.out.println("Por favor agregue levadura");
        System.out.println("Por favor agregue sal");
        System.out.println("Por favor agregue azucar");
    }

    private void prepararPanIntegral() {
        System.out.println("Por favor agregue harina integral");
        System.out.println("Por favor agregue leche");
        System.out.println("Por favor agregue agua");
        System.out.println("Por favor agregue margarina");
        System.out.println("Por favor agregue levadura");
        System.out.println("Por favor agregue sal");
        System.out.println("Por favor agregue azucar");

    }

    public boolean isSemillas() {
        return semillas;
    }

    public void setSemillas(boolean semillas) {
        this.semillas = semillas;
    }

    public boolean isIntegral() {
        return integral;
    }

    public void setIntegral(boolean integral) {
        this.integral = integral;
    }

    public int getNivelDetostado() {
        return nivelDetostado;
    }

    public void setNivelDetostado(int nivelDetostado) {
        this.nivelDetostado = nivelDetostado;
    }
}
