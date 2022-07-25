package Clase;

public class SmartDevice {

    protected String marca;
    protected String modelo;
    protected String color;
    protected int numserie;
    protected String camara;

    protected int velocidadcarga=0;

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, String color, int numserie, String camara) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numserie = numserie;
        this.camara = camara;
    }
    public void bateria (int carga){
        this.velocidadcarga += carga;
    }

}
